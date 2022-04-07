package com.wxs.gp.mapper;


import com.wxs.gp.domain.Judgment;

import java.util.List;

public interface JudgmentMapper {

    void addJudgment(Judgment judgment);

    List<Judgment> getJudgmentByPid(int id);
}
