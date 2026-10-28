package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rmq implements tbh {
    private final /* synthetic */ int $cid;

    public rmq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.tbh
    public final void a(SQLiteDatabase sQLiteDatabase) {
        switch (this.$cid) {
            case 0:
                sQLiteDatabase.execSQL("ALTER TABLE profile ADD COLUMN is_channel_hidden INTEGER DEFAULT 0");
                break;
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN delegation_type TEXT");
                break;
            case 2:
                sQLiteDatabase.execSQL("CREATE TABLE identity (account TEXT,gaia_id TEXT,profile_display_name TEXT,profile_display_email TEXT,profile_thumbnail_uri TEXT, PRIMARY KEY (account,gaia_id) ON CONFLICT REPLACE)");
                break;
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN id TEXT");
                break;
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN profile_account_name_proto BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN profile_account_photo_thumbnails_proto BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN profile_mobile_banner_thumbnails_proto BLOB");
                break;
            case 5:
                sQLiteDatabase.execSQL("CREATE TABLE identity_temp(id TEXT PRIMARY KEY,account TEXT,page_id TEXT)");
                sQLiteDatabase.execSQL("CREATE TABLE profile(id TEXT PRIMARY KEY,profile_display_name TEXT,profile_display_email TEXT,profile_thumbnail_uri TEXT,profile_account_name_proto BLOB,profile_account_photo_thumbnails_proto BLOB,profile_mobile_banner_thumbnails_proto BLOB,FOREIGN KEY(id) REFERENCES identity(id));");
                sQLiteDatabase.execSQL("INSERT OR IGNORE INTO identity_temp(id, account, page_id) SELECT id, account, gaia_id FROM identity");
                sQLiteDatabase.execSQL("INSERT OR IGNORE INTO profile(id, profile_display_name, profile_display_email, profile_thumbnail_uri, profile_account_name_proto, profile_account_photo_thumbnails_proto, profile_mobile_banner_thumbnails_proto) SELECT id, profile_display_name, profile_display_email, profile_thumbnail_uri, profile_account_name_proto, profile_account_photo_thumbnails_proto, profile_mobile_banner_thumbnails_proto FROM identity");
                sQLiteDatabase.execSQL("DROP TABLE identity");
                sQLiteDatabase.execSQL("ALTER TABLE identity_temp RENAME TO identity");
                break;
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN is_persona INTEGER DEFAULT 0");
                break;
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN datasync_id TEXT");
                break;
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN is_unicorn INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN is_griffin INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN is_teenacorn INTEGER DEFAULT 0");
                break;
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE profile ADD COLUMN channel_role_text TEXT");
                break;
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN delegation_context TEXT");
                break;
        }
    }
}
