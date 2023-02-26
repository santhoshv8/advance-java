package com.xworkz.eggapp.service;

import com.xworkz.eggapp.dto.EggDTO;

public interface EggService {

	public boolean saveAndValidate(EggDTO dto);
}
