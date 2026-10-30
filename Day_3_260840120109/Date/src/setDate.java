class setDate {

	private int day;
	private int month;
	private int year;
	
	setDate(int day, int month, int year) {
		setDateFormat(day, month, year);
	}
	
	setDate() {
		this.day = 1;
		this.month = 1;
		this.year = 2026;
	}
	
	public void setDateFormat(int day, int month, int year) {
		
		this.year = (year > 0) ? year : 2026;
		
		if (month < 1 || month > 12) {
			this.month = 1;
		} else {
			this.month = month;
		}
		
		int maxDays = getDaysInMonth(this.month, this.year);
		if (day < 1 || day > maxDays) {
			this.day = 1;
		} else {
			this.day = day;
		}
	}
	
	public boolean leapYear(int year) {
		if (year < 0) {
			return false;
		}
		
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			return true;
		}
		
		return false;
	}

	public int getDaysInMonth(int month, int year) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else {
			return leapYear(year) ? 29 : 28;
		}
	}

	public void addDays(int days) {
		if (days < 0) return;
		this.day += days;
		while (this.day > getDaysInMonth(this.month, this.year)) {
			this.day -= getDaysInMonth(this.month, this.year);
			this.month++;
			if (this.month > 12) {
				this.month = 1;
				this.year++;
			}
		}
	}

	public void addMonths(int months) {
		if (months < 0) return;
		this.month += months;
		while (this.month > 12) {
			this.month -= 12;
			this.year++;
		}
		int maxDays = getDaysInMonth(this.month, this.year);
		if (this.day > maxDays) {
			this.day = maxDays;
		}
	}

	public void addYears(int years) {
		if (years < 0) return;
		this.year += years;
		int maxDays = getDaysInMonth(this.month, this.year);
		if (this.day > maxDays) {
			this.day = maxDays;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	void display() {
		System.out.println(day + "/" + month + "/" + year);
	}
	
}