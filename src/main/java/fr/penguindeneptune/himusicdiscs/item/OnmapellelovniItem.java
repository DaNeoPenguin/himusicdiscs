
package fr.penguindeneptune.himusicdiscs.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import fr.penguindeneptune.himusicdiscs.MusicdiscsModElements;

@MusicdiscsModElements.ModElement.Tag
public class OnmapellelovniItem extends MusicdiscsModElements.ModElement {
	@ObjectHolder("musicdiscs:onmapellelovni")
	public static final Item block = null;

	public OnmapellelovniItem(MusicdiscsModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MusicdiscsModElements.sounds.get(new ResourceLocation("musicdiscs:onmapellefuze3")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("onmapellelovni");
		}
	}
}
