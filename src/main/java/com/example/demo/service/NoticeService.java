
package com.example.demo.service;

import com.example.demo.domain.Notice;
import com.example.demo.dto.NoticeDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface NoticeService {
    /**/
    NoticeDto.CreateResDto create(NoticeDto.CreateReqDto param);
    void update(NoticeDto.UpdateReqDto param);
    Map<String, Object> delete(Long id);
    List<NoticeDto.DetailResDto> list(NoticeDto.ListReqDto param);
    NoticeDto.DetailResDto detail(Long id);
}
