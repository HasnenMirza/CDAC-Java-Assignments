

import java.time.LocalDate;

public class Transaction {
        static int counter=0;
         int txId;
        LocalDate date;
        float txAmount;
        boolean txStatus;
        boolean txArrears;
        public int getTxId() {
            return txId;
        }
        public void setTxId(int txId) {
            this.txId = txId;
        }
        public Transaction( LocalDate date, float txAmount, boolean txStatus, boolean txArrears) {
            this.txId = ++counter;
            this.date = date;
            this.txAmount = txAmount;
            this.txStatus = txStatus;
            this.txArrears = txArrears;
        }
        public LocalDate getDate() {
            return date;
        }
        public void setDate(LocalDate date) {
            this.date = date;
        }
        public float getTxAmount() {
            return txAmount;
        }
        public void setTxAmount(float txAmount) {
            this.txAmount = txAmount;
        }
        public boolean isTxStatus() {
            return txStatus;
        }
        public void setTxStatus(boolean txStatus) {
            this.txStatus = txStatus;
        }
        public boolean isTxArrears() {
            return txArrears;
        }
        public void setTxArrears(boolean txArrears) {
            this.txArrears = txArrears;
        } 
    
}
