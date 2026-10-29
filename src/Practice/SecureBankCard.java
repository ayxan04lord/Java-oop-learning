package Practice;

public class SecureBankCard {

    private String owner;
    private double balance;
    private String pinCode;
    private double dailyLimit;
    private double spentToday;
    private int failedAttempts;
    private boolean isLocked;

    public SecureBankCard(String owner, double balance, String pinCode) {
        this.owner = owner;
        this.balance = balance;
        this.pinCode = pinCode;
        this.dailyLimit = 500;
        this.spentToday = 0;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public String withdraw(double amount, String pin) {

        // Hesab bloklanıbsa
        if (isLocked) {
            return "🚨 СЧЕТ ЗАБЛОКИРОВАН! Операция отклонена.";
        }

        // PIN yoxlanışı
        if (!pin.equals(pinCode)) {
            failedAttempts++;

            if (failedAttempts >= 3) {
                isLocked = true;
                return "🚨 СЧЕТ ЗАБЛОКИРОВАН! Операция отклонена.";
            }

            return "❌ Неверный PIN. Осталось попыток: " + (3 - failedAttempts);
        }

        // PIN düzdürsə
        failedAttempts = 0;

        // Balans yoxlanışı
        if (amount > balance) {
            return "❌ Недостаточно средств.";
        }

        // Günlük limit yoxlanışı
        if (spentToday + amount > dailyLimit) {
            return "❌ Превышен дневной лимит.";
        }

        // Pul çıxarma
        balance -= amount;
        spentToday += amount;

        return "✅ Операция успешна. Снято: " + amount +
                " AZN. Остаток: " + balance + " AZN.";
    }
}