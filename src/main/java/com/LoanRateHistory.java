package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class LoanRateHistory implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(generator = "LOANRATEHISTORY_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(name = "LOANRATEHISTORY_ID_GENERATOR", sequenceName = "LOANRATEHISTORY_ID_SEQ")
    private java.lang.Long id;

    public LoanRateHistory() {
    }
    
    public LoanRateHistory(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }




}