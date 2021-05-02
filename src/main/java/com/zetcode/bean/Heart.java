package com.zetcode.bean;

public class Heart {

    private String age;
	private String sex;
	private String cp;
	private String trestbps;
	private String chol;
	private String fbs;
	private String restecg;
	private String thalach;
	private String exang;
	private String oldpeak;
	private String slope;
	private String ca;
	private String thal;
	private String target;
	
    public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getTrestbps() {
		return trestbps;
	}

	public void setTrestbps(String trestbps) {
		this.trestbps = trestbps;
	}

	public String getChol() {
		return chol;
	}

	public void setChol(String chol) {
		this.chol = chol;
	}

	public String getFbs() {
		return fbs;
	}

	public void setFbs(String fbs) {
		this.fbs = fbs;
	}

	public String getRestecg() {
		return restecg;
	}

	public void setRestecg(String restecg) {
		this.restecg = restecg;
	}

	public String getThalach() {
		return thalach;
	}

	public void setThalach(String thalach) {
		this.thalach = thalach;
	}

	public String getExang() {
		return exang;
	}

	public void setExang(String exang) {
		this.exang = exang;
	}

	public String getOldpeak() {
		return oldpeak;
	}

	public void setOldpeak(String oldpeak) {
		this.oldpeak = oldpeak;
	}

	public String getSlope() {
		return slope;
	}

	public void setSlope(String slope) {
		this.slope = slope;
	}

	public String getCa() {
		return ca;
	}

	public void setCa(String ca) {
		this.ca = ca;
	}

	public String getThal() {
		return thal;
	}

	public void setThal(String thal) {
		this.thal = thal;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Heart() {
    }

    public Heart(String age, String sex, String cp, String trestbps, String chol, String fbs,
	             String restecg, String thalach, String exang, String oldpeak, String slope, 
				 String ca, String thal, String target) {

        this.age = age;
        this.sex = sex;
		this.cp = cp;
		this.trestbps = trestbps;
		this.chol = chol;
		this.fbs = fbs;
		this.restecg = restecg;
		this.thalach = thalach;
		this.exang = exang;
		this.oldpeak = oldpeak;
		this.slope = slope;
		this.ca = ca;
		this.thal = thal;
		this.target = target;
    }


}