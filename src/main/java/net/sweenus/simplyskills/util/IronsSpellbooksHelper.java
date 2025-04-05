package net.sweenus.simplyskills.util;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.List;

public class IronsSpellbooksHelper {

    public static final String ENDER_SPELL_POWER = "irons_spellbooks:ender_spell_power";
    public static final String ICE_SPELL_POWER = "irons_spellbooks:ice_spell_power";
    public static final String FIRE_SPELL_POWER = "irons_spellbooks:fire_spell_power";
    public static final String LIGHTNING_SPELL_POWER = "irons_spellbooks:lightning_spell_power";
    public static final String BLOOD_SPELL_POWER = "irons_spellbooks:blood_spell_power";
    public static final String NATURE_SPELL_POWER = "irons_spellbooks:nature_spell_power";
    public static final String EVOCATION_SPELL_POWER = "irons_spellbooks:evocation_spell_power";
    public static final String HOLY_SPELL_POWER = "irons_spellbooks:holy_spell_power";
    public static final String ELDRITCH_SPELL_POWER = "irons_spellbooks:eldritch_spell_power";

    // does not work during Initialize
    public static boolean isIronsSpellbooksLoaded() { return FabricLoader.getInstance().isModLoaded("irons_spellbooks"); }

    public static void addIronsSpellbooksSpellPowerAttributeEmpower(StatusEffect attunementEffect, String ironsSpellbooksSchool) {
        if (Registries.ATTRIBUTE.get(new Identifier(ironsSpellbooksSchool)) != null) {
            attunementEffect.addAttributeModifier(Registries.ATTRIBUTE.get(new Identifier(ironsSpellbooksSchool)),
                    "f8d0d948-a229-41d0-80ce-9bf0008db43f", 0.02, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        }
    }
}
