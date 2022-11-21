package com.example.friendsappv0;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "friendsDB";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_FRIENDS = "friends";
    private static final String ID = "id";
    private static final String FIRSTNAME = "firstname";
    private static final String LASTNAME = "lastname";
    private static final String EMAIL = "email";

    public DatabaseManager(Context context) {
        super (context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // method that is going to create the database for us?
    @Override
    public void onCreate(SQLiteDatabase db) {

        // build SQL create statement
        // method that will create the database for us
        String sqlCreate = "create table " + TABLE_FRIENDS + "( " + ID;
        sqlCreate += " integer primary key autoincrement, " + FIRSTNAME;
        sqlCreate += " text, " + LASTNAME;
        sqlCreate += " text, " + EMAIL;
        sqlCreate += " text) " ;


        db.execSQL(sqlCreate);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // Drop old table if it exists
        db.execSQL( "drop table if exists " + TABLE_FRIENDS );
        // Re-create tables
        onCreate(db);

    }


    public void insert (Friends friends) {
        SQLiteDatabase db = this.getWritableDatabase( );
        String sqlInsert = "insert into " + TABLE_FRIENDS;
        sqlInsert += " values( null, '" + friends.getFirstName( );
        sqlInsert += "', '" + friends.getLastName( );
        sqlInsert += "', '" + friends.getEmail( ) + "' )";

        db.execSQL( sqlInsert );
        db.close( );
    }


    // Create reference to database + sql string
    public ArrayList<Friends> selectAll() {
        String sqlQuery = "select * from " + TABLE_FRIENDS;

        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor cursor = db.rawQuery( sqlQuery, null );

        ArrayList<Friends> friends = new ArrayList<Friends>( );
        while( cursor.moveToNext( ) ) {
            Friends currentFriend
                    = new Friends( Integer.parseInt( cursor.getString( 0 ) ),
                    cursor.getString( 1 ), cursor.getString( 2 ), cursor.getString( 3 ));
            friends.add( currentFriend );
        }
        db.close( );
        return friends;
    }

    public void deleteById(int id) {
        SQLiteDatabase db = this.getWritableDatabase( );
        String sqlDelete = "delete from " + TABLE_FRIENDS;
        sqlDelete += " where " + ID + " = " + id;

        db.execSQL( sqlDelete );
        db.close( );
    }

    public void updateById(int friendsId, String fnameString, String lnameString, String emailString) {
        SQLiteDatabase db = this.getWritableDatabase();

        String sqlUpdate = "update " + TABLE_FRIENDS;
        sqlUpdate += " set " + FIRSTNAME + " = '" + fnameString + "', ";
        sqlUpdate += LASTNAME + " = '" + lnameString + "', ";
        sqlUpdate += EMAIL + " = '" + emailString + "' ";
        sqlUpdate += " where " + ID + " = " + friendsId;

        db.execSQL( sqlUpdate );
        db.close( );
    }
}
