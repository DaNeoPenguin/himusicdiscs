
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
public class MinecraftsongItem extends MusicdiscsModElements.ModElement {
	@ObjectHolder("musicdiscs:minecraftsong")
	public static final Item block = null;

	public MinecraftsongItem(MusicdiscsModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MusicdiscsModElements.sounds.get(new ResourceLocation("musicdiscs:mc_sembariplus")),
					new Item.Properties().group(CreativeTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("minecraftsong");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
