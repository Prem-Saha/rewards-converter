public class RewardValueTests {

    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
@@ -20,11 +22,18 @@ void create_with_miles_value() {

    @Test
    void convert_from_cash_to_miles() {
        assert false;
        double cashValue = 10;
        int expectedValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
        int milesValue = 1000;
        double expectedCash = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCash, rewardValue.getCashValue());

    }
}
