package com.ssi;

public class InterestService {
	
	public InterestModel compute(int amount, int time){
		//service is processing the data
		int rate=8;
		if(time<5){
			rate=6;
		}
		int interest=(amount*time*rate)/100;
		int net=amount+interest;
		
		//stores the process data in java object called model
		InterestModel model=new InterestModel();
		model.setAmount(amount);
		model.setTime(time);
		model.setRate(rate);
		model.setInterest(interest);
		model.setNet(net);
		//returns the model to controller
		return model;
	}
}
