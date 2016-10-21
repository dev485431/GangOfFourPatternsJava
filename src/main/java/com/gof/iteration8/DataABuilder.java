package com.gof.iteration8;

public class DataABuilder extends DataAPIBuilder {

	public void buildDataAPI(Long id) {
		dataAPI = new DataA(id);
	}

	@Override
	public void setDataMX() {
		dataAPI.setDataMX(generateRandomString(ALPHABET));
	}

	@Override
	public void setDataSX() {
		dataAPI.setDataSX(generateRandomString(ALPHABET));
	}

}
