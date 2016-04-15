package com.example.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMessage is a Querydsl query type for Message
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMessage extends EntityPathBase<Message> {

    private static final long serialVersionUID = 289437681L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMessage message1 = new QMessage("message1");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QLanguage lang;

    public final StringPath message = createString("message");

    public QMessage(String variable) {
        this(Message.class, forVariable(variable), INITS);
    }

    public QMessage(Path<? extends Message> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMessage(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMessage(PathMetadata<?> metadata, PathInits inits) {
        this(Message.class, metadata, inits);
    }

    public QMessage(Class<? extends Message> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.lang = inits.isInitialized("lang") ? new QLanguage(forProperty("lang")) : null;
    }

}

