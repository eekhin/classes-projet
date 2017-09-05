/**
 * File Name: Bug.java<br>
 * KHIN, EI EI<br>
 * Created: Sep 3, 2017
 */
package com.sqa.eiei;

/**
 * Bug //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author KHIN, EI EI
 * @version 1.0.0
 * @since 1.0
 */
public class Bug {

	private int bugid;

	private String reporterName;

	private String bugName;

	private char bugCategory;

	private String operatingSystem;

	private String date;

	private String bugDetails;

	private double frequency;

	private boolean isActive;

	/**
	 *
	 */
	public Bug() {
		this.bugid = 1;
		this.reporterName = "Jack";
		this.bugName = "Undefined";
		this.bugCategory = 'A';
		this.operatingSystem = "Window10";
		this.date = "09/03/2017";
		this.bugDetails = "Undefined the error";
		this.frequency = 2;
		this.isActive = false;
	}

	public Bug(int bugid, String reporterName, String bugName, char bugCategory, String operatingSystem, String date,
			String bugDetails, double frequency, boolean isActive) {
		super();
		this.bugid = bugid;
		this.reporterName = reporterName;
		this.bugName = bugName;
		this.bugCategory = bugCategory;
		this.operatingSystem = operatingSystem;
		this.date = date;
		this.bugDetails = bugDetails;
		this.frequency = frequency;
		this.isActive = isActive;
	}

	public char getBugCategory() {
		return this.bugCategory;
	}

	public String getBugDetails() {
		return this.bugDetails;
	}

	public int getBugid() {
		return this.bugid;
	}

	public String getBugName() {
		return this.bugName;
	}

	public String getDate() {
		return this.date;
	}

	public double getFrequency() {
		return this.frequency;
	}

	public String getOperatingSystem() {
		return this.operatingSystem;
	}

	public String getReporterName() {
		return this.reporterName;
	}

	public boolean isActive() {
		return this.isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void setBugCategory(char bugCategory) {
		this.bugCategory = bugCategory;
	}

	public void setBugDetails(String bugDetails) {
		this.bugDetails = bugDetails;
	}

	public void setBugid(int bugid) {
		this.bugid = bugid;
	}

	public void setBugName(String bugName) {
		this.bugName = bugName;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[bugid=" + this.bugid + ", reporterName=" + this.reporterName
				+ ", bugName=" + this.bugName + ", bugCategory=" + this.bugCategory + ", operatingSystem="
				+ this.operatingSystem + ", date=" + this.date + ", bugDetails=" + this.bugDetails + ", frequency="
				+ this.frequency + ", isActive=" + this.isActive + "]";
	}

	private void applyBugFix() {
		System.out.println("Apply Bug Fix");
	}

	private void findSimilarBugs() {
		System.out.println("Similar Bugs");
	}

	private void recreateBugActivity() {
		System.out.println("Bug Activity");
	}
}
