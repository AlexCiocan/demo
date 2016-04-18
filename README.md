Spring IO feature announcement [ QueryDSL support for web & spring data-rest ]:
https://spring.io/blog/2015/09/04/what-s-new-in-spring-data-release-gosling#querydsl-web-support

Official Spring rest-data example: https://gist.github.com/olivergierke/decf03d4948cd58a51bc

	    https://github.com/spring-projects/spring-data-examples/tree/master/web/querydsl

BUG:
https://jira.spring.io/browse/DATAREST-671
QueryDSL+Envers: http://forum.spring.io/forum/spring-projects/data/119874-repository-extending-spring-data-envers-and-querydsl
https://jira.springsource.org/browse/DATAJPA-387


QueryDsl regex bug:
https://github.com/querydsl/querydsl/issues/1713
https://groups.google.com/forum/#!topic/querydsl/o9H05mRfdLQ

QueryDsl can only be customized with java 8 -> aop for fixing problem\
ref : org.springframework.data.rest.webmvc.config.QuerydslAwareRootResourceInformationHandlerMethodArgumentResolver line 90: hardcoded + findCustomizedForDomainType



Now it works using..seems like expr should start with .???
http://localhost:8080/messages?lang.isocode=en&message=.*_en.


