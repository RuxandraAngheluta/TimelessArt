package entity;

import com.speedment.jpastreamer.field.ComparableField;
import com.speedment.jpastreamer.field.IntField;
import com.speedment.jpastreamer.field.ReferenceField;
import entity.OrderEntity.orderStatus;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * The generated base for entity {@link OrderEntity} representing entities of
 * the {@code orderEntity}-table in the database.
 * <p> This file has been automatically generated by JPAStreamer.
 * 
 * @author JPAStreamer
 */
public final class OrderEntity$ {
    
    /**
     * This Field corresponds to the {@link OrderEntity} field "id".
     */
    public static final IntField<OrderEntity> id = IntField.create(
        OrderEntity.class,
        "id",
        OrderEntity::getId,
        false
    );
    /**
     * This Field corresponds to the {@link OrderEntity} field "client".
     */
    public static final ReferenceField<OrderEntity, ClientsEntity> client = ReferenceField.create(
        OrderEntity.class,
        "client",
        OrderEntity::getClient,
        false
    );
    /**
     * This Field corresponds to the {@link OrderEntity} field "updateDate".
     */
    public static final ComparableField<OrderEntity, Timestamp> updateDate = ComparableField.create(
        OrderEntity.class,
        "updateDate",
        OrderEntity::getUpdateDate,
        false
    );
    /**
     * This Field corresponds to the {@link OrderEntity} field "artworks".
     */
    public static final ReferenceField<OrderEntity, List<ArtworkEntity>> artworks = ReferenceField.create(
        OrderEntity.class,
        "artworks",
        OrderEntity::getArtworks,
        false
    );
    /**
     * This Field corresponds to the {@link OrderEntity} field "price".
     */
    public static final ComparableField<OrderEntity, BigDecimal> price = ComparableField.create(
        OrderEntity.class,
        "price",
        OrderEntity::getPrice,
        false
    );
    /**
     * This Field corresponds to the {@link OrderEntity} field "status".
     */
    public static final ComparableField<OrderEntity, orderStatus> status = ComparableField.create(
        OrderEntity.class,
        "status",
        OrderEntity::getStatus,
        false
    );
    /**
     * This Field corresponds to the {@link OrderEntity} field "orderDate".
     */
    public static final ComparableField<OrderEntity, Date> orderDate = ComparableField.create(
        OrderEntity.class,
        "orderDate",
        OrderEntity::getOrderDate,
        false
    );
}