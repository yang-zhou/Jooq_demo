/*
 * This file is generated by jOOQ.
 */
package com.cy.info.jooq.tables;


import com.cy.info.jooq.Indexes;
import com.cy.info.jooq.JooqDemo;
import com.cy.info.jooq.Keys;
import com.cy.info.jooq.tables.records.TBookRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBook extends TableImpl<TBookRecord> {

    private static final long serialVersionUID = 572189392;

    /**
     * The reference instance of <code>jooq_demo.t_book</code>
     */
    public static final TBook T_BOOK = new TBook();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TBookRecord> getRecordType() {
        return TBookRecord.class;
    }

    /**
     * The column <code>jooq_demo.t_book.book_id</code>.
     */
    public final TableField<TBookRecord, String> BOOK_ID = createField(DSL.name("book_id"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>jooq_demo.t_book.book_name</code>.
     */
    public final TableField<TBookRecord, String> BOOK_NAME = createField(DSL.name("book_name"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>jooq_demo.t_book.book_number</code>.
     */
    public final TableField<TBookRecord, String> BOOK_NUMBER = createField(DSL.name("book_number"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>jooq_demo.t_book</code> table reference
     */
    public TBook() {
        this(DSL.name("t_book"), null);
    }

    /**
     * Create an aliased <code>jooq_demo.t_book</code> table reference
     */
    public TBook(String alias) {
        this(DSL.name(alias), T_BOOK);
    }

    /**
     * Create an aliased <code>jooq_demo.t_book</code> table reference
     */
    public TBook(Name alias) {
        this(alias, T_BOOK);
    }

    private TBook(Name alias, Table<TBookRecord> aliased) {
        this(alias, aliased, null);
    }

    private TBook(Name alias, Table<TBookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TBook(Table<O> child, ForeignKey<O, TBookRecord> key) {
        super(child, key, T_BOOK);
    }

    @Override
    public Schema getSchema() {
        return JooqDemo.JOOQ_DEMO;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_BOOK_PRIMARY);
    }

    @Override
    public UniqueKey<TBookRecord> getPrimaryKey() {
        return Keys.KEY_T_BOOK_PRIMARY;
    }

    @Override
    public List<UniqueKey<TBookRecord>> getKeys() {
        return Arrays.<UniqueKey<TBookRecord>>asList(Keys.KEY_T_BOOK_PRIMARY);
    }

    @Override
    public TBook as(String alias) {
        return new TBook(DSL.name(alias), this);
    }

    @Override
    public TBook as(Name alias) {
        return new TBook(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TBook rename(String name) {
        return new TBook(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TBook rename(Name name) {
        return new TBook(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}