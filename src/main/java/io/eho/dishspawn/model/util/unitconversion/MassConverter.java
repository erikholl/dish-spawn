package io.eho.dishspawn.model.util.unitconversion;

import io.eho.dishspawn.exception.UnitDoesNotExistException;

// note in syntax that MassConverter.MassUnit needs to be referred to as
// parameter in implemented interface. The interface does not know about the
// MassUnit enum directly
public class MassConverter implements AbstractUnitConverter<MassConverter.MassUnit> {

    // static? to access the factors without creating a converter? hmmm...
//    private static final double gram = 1;
    private static final double GRAM_TO_OUNCE_FACTOR = 0.0357142857;
    private static final double GRAM_TO_POUND_FACTOR = 0.0022026432;
    private static final double GRAM_TO_KILOGRAM_FACTOR = 0.001;

    @Override
    public double convert(double quantity, MassUnit unitFrom,
                           MassUnit unitTo) {
        // note the switch cases below are not an exhaustive list of all possible
        // combinations; only combinations needed to support the
        // application functionality are included:
        // - input recipe: requires all MassUnits to convert to GRAM
        // - extract recipe: requires MassUnit GRAM to convert to other MassUnit
        switch (unitFrom) {
            case GRAM:
                switch (unitTo) {
                    case GRAM:
                        return quantity;
                    case OUNCE:
                        return quantity * GRAM_TO_OUNCE_FACTOR;
                    case KILOGRAM:
                        return quantity * GRAM_TO_KILOGRAM_FACTOR;
                    case POUND:
                        return quantity * GRAM_TO_POUND_FACTOR;
                    default:
                        throw new UnsupportedOperationException();
                }
            case KILOGRAM:
                return quantity / GRAM_TO_KILOGRAM_FACTOR;
            case OUNCE:
                return quantity / GRAM_TO_OUNCE_FACTOR;
            case POUND:
                return quantity / GRAM_TO_POUND_FACTOR;
            default:
                throw new UnitDoesNotExistException("unknown unit");
                // note this exception assumes a user would be able to input any
                // kind of unit instead of being limited to a selection
        }
    }

    @Override
    public MassUnit parseStringToUnit(String input) {
        return MassUnit.valueOf(input);
    }

    // enum embedded because it really belongs to this class only
    public enum MassUnit {
        GRAM("Grams"),
        KILOGRAM("Kilograms"),      // 1000 grams
        OUNCE("Ounce"),             // 28 grams
        PIECE("Pieces"),            // NO MASS CONVERSION!
        POUND("Pounds");            // 454 grams


        private final String label;

        MassUnit(String label) {
            this.label = label;
        }
    }
}
