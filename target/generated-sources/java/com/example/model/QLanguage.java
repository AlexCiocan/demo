package com.example.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QLanguage is a Querydsl query type for Language
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLanguage extends EntityPathBase<Language> {

    private static final long serialVersionUID = -768862034L;

    public static final QLanguage language = new QLanguage("language");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath isocode = createString("isocode");

    public QLanguage(String variable) {
        super(Language.class, forVariable(variable));
    }

    public QLanguage(Path<? extends Language> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLanguage(PathMetadata<?> metadata) {
        super(Language.class, metadata);
    }

}

