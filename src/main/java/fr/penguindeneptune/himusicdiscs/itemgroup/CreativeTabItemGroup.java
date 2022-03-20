
package fr.penguindeneptune.himusicdiscs.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import fr.penguindeneptune.himusicdiscs.item.MinecraftsongItem;
import fr.penguindeneptune.himusicdiscs.MusicdiscsModElements;

@MusicdiscsModElements.ModElement.Tag
public class CreativeTabItemGroup extends MusicdiscsModElements.ModElement {
	public CreativeTabItemGroup(MusicdiscsModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcreative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MinecraftsongItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
