package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ConditionVariable;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rmc implements rmb {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/account/identity/DefaultDatabase");
    private static final String d = "is_persona = 0 AND (page_id = \"\" OR page_id IS NULL) AND delegation_type != \"GAIA_DELEGATION_TYPE_EARLY\" AND delegation_type != \"" + ahng.ap(4) + "\" AND datasync_id != \"\"";
    private static final String e = "(is_persona != 0 OR (page_id != \"\" AND page_id IS NOT NULL)  OR delegation_type = \"GAIA_DELEGATION_TYPE_EARLY\" OR delegation_type = \"" + ahng.ap(4) + "\") AND datasync_id != \"\"";
    public final tbc a;
    public final ConditionVariable b;
    private final Executor f;
    private final awmd g;

    public rmc(Context context, Executor executor, awmd awmdVar) {
        context.getClass();
        this.a = new rmt(context);
        executor.getClass();
        this.f = new ahfg(executor);
        this.g = awmdVar;
        this.b = new ConditionVariable(true);
    }

    private final Cursor k(String str, String[] strArr, String str2) {
        return this.a.getReadableDatabase().query(str, strArr, "id = ?", new String[]{str2}, null, null, null, "1");
    }

    private final agke l(String str, String str2) {
        agke agkeVarG;
        this.b.block();
        int i = rmr.b;
        Cursor cursorQuery = this.a.getReadableDatabase().query("identity", rmr.a, str, null, null, null, null, null);
        try {
            if (cursorQuery.getCount() == 0) {
                agkeVarG = agpi.a;
            } else {
                agjz agjzVar = new agjz(4);
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(4);
                    if (TextUtils.isEmpty(string)) {
                        z = true;
                    } else {
                        String string2 = cursorQuery.getString(1);
                        if (!arrayList.contains(string)) {
                            aihh aihhVar = (aihh) afhq.a.createBuilder();
                            aihhVar.copyOnWrite();
                            afhq afhqVar = (afhq) aihhVar.instance;
                            afhqVar.b |= SemanticState.Hidden;
                            afhqVar.f = str2;
                            aihhVar.copyOnWrite();
                            afhq afhqVar2 = (afhq) aihhVar.instance;
                            string.getClass();
                            afhqVar2.b |= 1;
                            afhqVar2.c = string;
                            aihhVar.copyOnWrite();
                            afhq afhqVar3 = (afhq) aihhVar.instance;
                            string2.getClass();
                            afhqVar3.b |= 16;
                            afhqVar3.e = string2;
                            agjzVar.h((afhq) aihhVar.build());
                            arrayList.add(string);
                        }
                    }
                }
                if (z) {
                    zvp.a(zvn.b, zvm.I, "[Clockwork][Database] getAccountInfos dropping empty datasyncid");
                    dov dovVar = (dov) this.g.io();
                    alos alosVar = (alos) alou.a.createBuilder();
                    aihf aihfVarCreateBuilder = aiqy.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aiqy aiqyVar = (aiqy) aihfVarCreateBuilder.instance;
                    aiqyVar.e = 16;
                    aiqyVar.b |= 4;
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    aiqy aiqyVar2 = (aiqy) aihfVarCreateBuilder.build();
                    aiqyVar2.getClass();
                    alouVar.d = aiqyVar2;
                    alouVar.c = 389;
                    dovVar.R((alou) alosVar.build());
                }
                agkeVarG = agjzVar.g();
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return agkeVarG;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private final ListenableFuture m(String str, ContentValues contentValues) {
        this.b.close();
        return ahno.ao(new rmx(this, str, contentValues, 1, null), this.f);
    }

    private final void n(String str, String str2, String[] strArr) {
        this.b.close();
        this.f.execute(afwl.i(new mrh((Object) this, str, str2, (Object) strArr, 6)));
    }

    private static final rlt o(Cursor cursor) {
        if (cursor.getInt(3) == 1) {
            return rlt.n(cursor.getString(0), cursor.getString(1), null, false, false, true, false, false, false, 3, cursor.getString(4));
        }
        if (cursor.getInt(5) == 1) {
            if ("GAIA_DELEGATION_TYPE_EARLY".equals(cursor.getString(9))) {
                return rlt.n(cursor.getString(0), cursor.getString(1), null, false, false, false, true, false, false, 3, cursor.getString(4));
            }
            return rlt.n(cursor.getString(0), cursor.getString(1), null, false, false, false, true, false, cursor.getInt(7) == 1, 2, cursor.getString(4));
        }
        if (cursor.getInt(6) == 1) {
            return rlt.n(cursor.getString(0), cursor.getString(1), null, false, false, false, false, true, cursor.getInt(7) == 1, 2, cursor.getString(4));
        }
        String string = cursor.getString(8);
        if (string != null && !string.equals("NO_DELEGATION_CONTEXT")) {
            return rlt.o(cursor.getString(0), cursor.getString(1), cursor.getString(4), 4, cursor.getString(8));
        }
        return rlt.n(cursor.getString(0), cursor.getString(1), !cursor.isNull(2) ? cursor.getString(2) : null, false, false, false, false, false, false, 2, cursor.getString(4));
    }

    private static final void p(ContentValues contentValues, String str, abuz abuzVar) {
        if (abuzVar == null || !abuzVar.m()) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, abuzVar.l().toByteArray());
        }
    }

    @Override // defpackage.rmb
    public final rmv a(rlt rltVar) {
        rmv rmvVar;
        Cursor cursorK = k("profile", rms.a, rltVar.a);
        try {
            try {
                if (cursorK.moveToFirst()) {
                    String str = rltVar.b;
                    if (cursorK.isNull(0)) {
                        rmvVar = new rmv(cursorK.getString(3), cursorK.getString(4), Uri.parse(cursorK.getString(5)));
                    } else {
                        byte[] blob = cursorK.getBlob(0);
                        byte[] blob2 = cursorK.getBlob(1);
                        byte[] blob3 = cursorK.getBlob(2);
                        rmvVar = new rmv(str, (alay) aihn.parseFrom(alay.a, blob, ExtensionRegistryLite.getGeneratedRegistry()), blob2 != null ? new abuz((aqmh) aihn.parseFrom(aqmh.a, blob2)) : null, blob3 != null ? new abuz((aqmh) aihn.parseFrom(aqmh.a, blob3)) : null, cursorK.getString(6), cursorK.getInt(7) == 1);
                    }
                }
            } catch (aiik e2) {
                ((agrc) ((agrc) ((agrc) c.b()).j(e2)).k("com/google/android/libraries/youtube/account/identity/DefaultDatabase", "getProfile", SemanticState.Hidden, "DefaultDatabase.java")).t("Error parsing profile data");
            }
            return rmv.a;
        } finally {
            if (cursorK != null) {
                cursorK.close();
            }
        }
    }

    @Override // defpackage.rmb
    public final agke b() {
        return l(e, "youtube-delegated");
    }

    @Override // defpackage.rmb
    public final agke c() {
        return l(d, "youtube-direct");
    }

    @Override // defpackage.rmb
    public final ListenableFuture d(rlt rltVar) {
        if (rltVar.d) {
            return aher.a;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", rltVar.a);
        contentValues.put("account", rltVar.b);
        contentValues.put("page_id", rltVar.c);
        contentValues.put("is_persona", Integer.valueOf(rltVar.f ? 1 : 0));
        contentValues.put(rmp.DATASYNC_ID, rltVar.g);
        contentValues.put("is_unicorn", Integer.valueOf(rltVar.h ? 1 : 0));
        contentValues.put("is_griffin", Integer.valueOf(rltVar.i ? 1 : 0));
        contentValues.put("is_teenacorn", Integer.valueOf(rltVar.j ? 1 : 0));
        contentValues.put(rmp.DELEGATION_CONTEXT, rltVar.k);
        contentValues.put(rmp.DELEGATION_TYPE, ahng.ap(rltVar.l));
        return m("identity", contentValues);
    }

    @Override // defpackage.rmb
    public final List e(String[] strArr) {
        String[] strArr2;
        String string;
        this.b.block();
        if (strArr.length == 0) {
            string = null;
            strArr2 = null;
        } else {
            StringBuilder sb = new StringBuilder("account NOT IN (");
            for (int i = 0; i < strArr.length - 1; i++) {
                sb.append("?, ");
            }
            sb.append("?)");
            strArr2 = strArr;
            string = sb.toString();
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.a.getReadableDatabase().query("identity", rmr.a, string, strArr2, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                if (!cursorQuery.isNull(0)) {
                    arrayList.add(o(cursorQuery));
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.rmb
    public final void f(String[] strArr) {
        this.b.block();
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder("account IN (");
            for (int i = 0; i < strArr.length - 1; i++) {
                sb.append("?, ");
            }
            sb.append("?)");
            n("identity", sb.toString(), strArr);
        }
    }

    @Override // defpackage.rmb
    public final void g(String str) {
        n("profile", "id = ?", new String[]{str});
    }

    @Override // defpackage.rmb
    public final void h(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", str2);
        this.b.close();
        this.f.execute(afwl.i(new lez((Object) this, (Object) contentValues, (Object) new String[]{str}, 20, (byte[]) null)));
    }

    @Override // defpackage.rmb
    public final void i(String str, rmv rmvVar) {
        if (rmvVar == null || rmvVar.equals(rmv.a)) {
            return;
        }
        alay alayVar = rmvVar.c;
        if (alayVar == null) {
            throw new IllegalArgumentException("accountNameProto cannot be null");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", str);
        contentValues.put("profile_account_name_proto", alayVar.toByteArray());
        p(contentValues, "profile_account_photo_thumbnails_proto", rmvVar.g);
        p(contentValues, "profile_mobile_banner_thumbnails_proto", rmvVar.h);
        String str2 = rmvVar.e;
        if (str2 != null) {
            contentValues.put("channel_role_text", str2);
        } else {
            contentValues.putNull("channel_role_text");
        }
        contentValues.put("is_channel_hidden", Integer.valueOf(rmvVar.f ? 1 : 0));
        m("profile", contentValues);
    }

    public final zwa j(String str, boolean z) {
        rlt rltVarO = null;
        if (str != null) {
            this.b.block();
            Cursor cursorQuery = z ? this.a.getReadableDatabase().query("identity", rmr.a, "datasync_id = ?", new String[]{str}, null, null, null, "1") : k("identity", rmr.a, str);
            try {
                rltVarO = cursorQuery.moveToFirst() ? o(cursorQuery) : null;
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
        return rltVarO;
    }
}
