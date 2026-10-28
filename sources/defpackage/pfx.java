package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pfx {
    public static final agsn a = agsn.h("GnpSdk");

    public static int a(Cursor cursor, String str) throws pfw {
        try {
            return cursor.getColumnIndexOrThrow(str);
        } catch (IllegalArgumentException e) {
            throw new pfw(str, e);
        }
    }

    public static boolean b(qoe qoeVar) {
        return qoeVar == null || qoeVar.a.isEmpty();
    }

    public static void c(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        tld tldVar = new tld();
        tldVar.A("ALTER TABLE ");
        tldVar.A("threads");
        tldVar.A(" ADD COLUMN ");
        tldVar.A(str);
        tldVar.A(" ");
        tldVar.A(str2);
        qoe qoeVarZ = tldVar.z();
        sQLiteDatabase.execSQL(qoeVarZ.a, qoeVarZ.a());
    }

    public static agke d(qoe qoeVar, String str, String[] strArr) {
        int length = strArr.length;
        if (length <= 900) {
            tld tldVar = new tld();
            if (!b(qoeVar)) {
                tldVar.B(qoeVar.a, qoeVar.a());
                tldVar.A(" AND ");
            }
            tldVar.B(g(str, length), strArr);
            return agke.q(tldVar.z());
        }
        agjz agjzVar = new agjz(4);
        int i = 0;
        while (true) {
            int length2 = strArr.length;
            if (i >= length2) {
                return agjzVar.g();
            }
            int i2 = i + 900;
            String[] strArr2 = (String[]) Arrays.copyOfRange(strArr, i, Math.min(i2, length2));
            tld tldVar2 = new tld();
            if (!b(qoeVar)) {
                tldVar2.B(qoeVar.a, qoeVar.a());
                tldVar2.A(" AND ");
            }
            tldVar2.B(g(str, strArr2.length), strArr2);
            agjzVar.h(tldVar2.z());
            i = i2;
        }
    }

    public static MessageLite e(Cursor cursor, MessageLite messageLite, String str) {
        try {
            byte[] blob = cursor.getBlob(a(cursor, str));
            if (blob != null) {
                return messageLite.toBuilder().mergeFrom(blob).build();
            }
        } catch (aiik e) {
            ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/internal/storage/impl/DatabaseHelper", "safeParseMessage", 152, "DatabaseHelper.java")).B("Error parsing column %s for notification %s", str, cursor.getString(a(cursor, "thread_id")));
        }
        return null;
    }

    public static List f(Cursor cursor, MessageLite messageLite, String str) {
        pzm pzmVar;
        ArrayList arrayList = new ArrayList();
        try {
            byte[] blob = cursor.getBlob(a(cursor, str));
            if (blob != null && (pzmVar = (pzm) ((aihf) pzm.a.createBuilder().mergeFrom(blob)).build()) != null) {
                Iterator it = pzmVar.b.iterator();
                while (it.hasNext()) {
                    arrayList.add(messageLite.toBuilder().mergeFrom(((aifv) it.next()).c).build());
                }
            }
        } catch (aiik e) {
            ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/internal/storage/impl/DatabaseHelper", "safeParseMessageList", 175, "DatabaseHelper.java")).B("Error parsing column %s for notification %s", str, cursor.getString(a(cursor, "thread_id")));
        }
        return arrayList;
    }

    private static String g(String str, int i) {
        if (i <= 0 || TextUtils.isEmpty(str)) {
            ((agsj) ((agsj) ((agsj) a.c()).j(new Exception())).k("com/google/android/libraries/notifications/internal/storage/impl/DatabaseHelper", "getInClause", 135, "DatabaseHelper.java")).y("Error creating IN clause for number: [%d], column [%s]", i, str);
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" IN (");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append("?,");
        }
        sb.append("?)");
        return sb.toString();
    }
}
