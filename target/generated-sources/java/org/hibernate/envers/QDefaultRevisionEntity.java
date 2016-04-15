package org.hibernate.envers;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QDefaultRevisionEntity is a Querydsl query type for DefaultRevisionEntity
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QDefaultRevisionEntity extends EntityPathBase<DefaultRevisionEntity> {

    private static final long serialVersionUID = -546101328L;

    public static final QDefaultRevisionEntity defaultRevisionEntity = new QDefaultRevisionEntity("defaultRevisionEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public QDefaultRevisionEntity(String variable) {
        super(DefaultRevisionEntity.class, forVariable(variable));
    }

    public QDefaultRevisionEntity(Path<? extends DefaultRevisionEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDefaultRevisionEntity(PathMetadata<?> metadata) {
        super(DefaultRevisionEntity.class, metadata);
    }

}

