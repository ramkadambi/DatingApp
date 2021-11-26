package com.iiht.training.datingapp.service;

import java.util.List;

import com.iiht.training.datingapp.dto.DislikeDto;

public interface DislikesService {

	public List<DislikeDto> getAllDislikes(Long userId);

	public DislikeDto saveDislike(DislikeDto dislike);
}
