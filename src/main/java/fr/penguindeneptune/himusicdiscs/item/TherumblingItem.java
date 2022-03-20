
package fr.penguindeneptune.himusicdiscs.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import fr.penguindeneptune.himusicdiscs.itemgroup.CreativeTabItemGroup;
import fr.penguindeneptune.himusicdiscs.MusicdiscsModElements;

@MusicdiscsModElements.ModElement.Tag
public class TherumblingItem extends MusicdiscsModElements.ModElement {
	@ObjectHolder("musicdiscs:therumbling")
	public static final Item block = null;

	public TherumblingItem(MusicdiscsModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MusicdiscsModElements.sounds.get(new ResourceLocation("musicdiscs:therumbling")),
					new Item.Properties().group(CreativeTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("therumbling");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
