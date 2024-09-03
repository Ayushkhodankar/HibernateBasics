# Hibernate
* Hibernate ORM
    - _core/Basic_: simple comparison between JDBC, ORM, and JPA
    - _core/Fetching Strategies_: "when" (laziness) and "how" (fetch style)
    - _core/Value Generation_: annotations allowing in-memory and DB generated properties, both for INSERT and INSERT/UPDATE actions
    - _core/Multi-Tenancy_: multiple, concurrent databases and clients from a single Hibernate instance
    - _core/Caching_: entity second level cache (2LC) and query cache
    - _core/Envers_: historical/audited data
    - _core/Spatial_: geographical data
    - _osgi_: tutorials demonstrating all possible ORM OSGi configurations
* Hibernate OGM
    - _hiking-demo_: Demo project used for the talk "Hibernate OGM: Talking to NoSQL in Red Hat JBoss EAP" presented at Red Hat Summit 2014. It shows how to use MongoDB as data store in a Java EE application through JPA / Hibernate OGM.
* Hibernate Search
    - _hsearch-elasticsearch-wikipedia_: Demonstrates a REST service using Hibernate Search + Elasticsearch to search a large dataset from Wikipedia.
    - _hsearch-quarkus_: Demonstrates a REST service with CRUD and full-text search features
      implemented using Quarkus, Hibernate Search and Elasticsearch.
      Accompanies the blog post https://in.relation.to/2019/11/12/hibernate-search-quarkus/
    - _hsearch-feature-examples_: Demonstrates various features of Hibernate Search 6 with Elasticsearch in Quarkus.
      Used in [Quarkus insights Episode 32](https://www.youtube.com/watch?v=hwxWx-ORVwM).
    - _hsearch-outbox-polling_: Demonstrates Hibernate Search's `outbox-polling` coordination with Elasticsearch in Quarkus.
      Used for a [talk in French at RivieraDev 2023](https://yrodiere.github.io/presentation/2023-07-rivieradev-quarkus-hsearch/).
    - _hsearch-with-elasticsearch_: Shows how to use the Elasticsearch backend in Hibernate Search 6.x.
      Used for the talk "From Hibernate to Elasticsearch in no Time" at JavaZone 2016 (back then it was using Hibernate Search 5.x).
* Hibernate Validator
    - _threeten-extra-validator-example_: Constraint validators for ThreeTen Extra date/time types.
      Accompanies the blog post http://in.relation.to/2017/03/02/adding-custom-constraint-definitions-via-the-java-service-loader/
    - _time-duration-validator-example_: Custom constraint and validator, retrieved via the service loader.
      Accompanies the blog post http://in.relation.to/2017/03/02/adding-custom-constraint-definitions-via-the-java-service-loader/
    - _updating-hv-in-wildfly_: How to upgrade WildFly 10 to the latest version of Hibernate Validator.
      Accompanies the blog post http://in.relation.to/2017/04/04/testing-bean-validation-2-0-on-wildfly-10/
    - _javafx-validation-example_: Shows usage of Bean Validation 2 with JavaFX
    - _custom-value-extractors_: Shows how to put constraints to custom containers such as Guava's `Multimap`.
      Accompanies the blog post http://in.relation.to/2018/02/26/putting-bean-validation-constraints-to-multimaps/

* Java 9
    - _multi-release-jar-demo_: Shows how to build multi-release JARs with Java 9.
      Accompanies the blog post http://in.relation.to/2017/02/13/building-multi-release-jars-with-maven/
    - _custom-jlink-plugin_: Shows how to customize Java 9 modular runtime images with jlink plug-ins. The example shows a plug-in for adding a Jandex annotation index for one or more modules to the runtime image.
* Other
    - _wildfly-patch-creation_: How to create WildFly patch files.
      Accompanies the blog post http://in.relation.to/2017/05/29/creating-patches-for-wildfly/
    - _cdi-jpa-testing_: How to run JUnit tests using CDI, JPA and JTA
