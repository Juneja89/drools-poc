package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Prepayment implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "PREPAYMENT_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "PREPAYMENT_ID_GENERATOR", sequenceName = "PREPAYMENT_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Start Date")
	private java.time.LocalDate startDate;

	@org.kie.api.definition.type.Label("End Date")
	private java.time.LocalDate endDate;

	@org.kie.api.definition.type.Label("Total interest")
	private java.lang.Integer totalInterest;

	@org.kie.api.definition.type.Label(value = "Amount")
	private java.lang.Long amount;

	public Prepayment() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.time.LocalDate getStartDate() {
		return this.startDate;
	}

	public void setStartDate(java.time.LocalDate startDate) {
		this.startDate = startDate;
	}

	public java.time.LocalDate getEndDate() {
		return this.endDate;
	}

	public void setEndDate(java.time.LocalDate endDate) {
		this.endDate = endDate;
	}

	public java.lang.Integer getTotalInterest() {
		return this.totalInterest;
	}

	public void setTotalInterest(java.lang.Integer totalInterest) {
		this.totalInterest = totalInterest;
	}

	public java.lang.Long getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.Long amount) {
		this.amount = amount;
	}

	public Prepayment(java.lang.Long id, java.time.LocalDate startDate,
			java.time.LocalDate endDate, java.lang.Integer totalInterest,
			java.lang.Long amount) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalInterest = totalInterest;
		this.amount = amount;
	}

}