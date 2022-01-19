package com.ebuild.practice.springbatchpractice.basic.job;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class SimpleJobConfig {

  private final JobBuilderFactory jobBuilderFactory;
  private final StepBuilderFactory stepBuilderFactory;

  @Bean
  public Job simpleJob(){
    return jobBuilderFactory.get("simple")
        .start(simpleStep1())
        .next(simpleStep2())
        .build();
  }

  @Bean
  public Step simpleStep1() {
    return stepBuilderFactory.get("simpleStep1")
        .tasklet((contribution, chunkContext)->{
          log.info("##############################################");
          log.info("############### simpleStep1 실행 ############## ");
          log.info("##############################################");
          return RepeatStatus.FINISHED;
        })
        .build();
  }

  @Bean
  public Step simpleStep2() {
    return stepBuilderFactory.get("simpleStep2")
        .tasklet((contribution, chunkContext)->{
          log.info("##############################################");
          log.info("############### simpleStep2 실행 ############## ");
          log.info("##############################################");
          return RepeatStatus.FINISHED;
        })
        .build();
  }

}
