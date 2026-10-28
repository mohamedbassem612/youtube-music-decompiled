package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.view.ContextThemeWrapper;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.media.player.exo2.platypus.ExecutorImpl;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afip {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public afip(awmd awmdVar, adak adakVar, awmd awmdVar2, awmd awmdVar3, ahex ahexVar) {
        this.e = awmdVar;
        this.g = adakVar;
        this.a = awmdVar2;
        this.f = awmdVar3;
        this.b = ahexVar;
        this.d = new ConcurrentHashMap();
        this.c = aguu.al(new tpc(this, 16));
        this.h = aguu.al(new tpc(this, 17));
        awmdVar.getClass();
        rru rruVar = new rru(awmdVar, 8);
        long j = afwl.a;
        ahexVar.execute(new ahfo(new ahcz(afty.c(false), rruVar, 1)));
    }

    public static final void G(wjf wjfVar, acip acipVar) {
        acipVar.aT().kk(new aayp(wjfVar, acipVar.au()));
    }

    public static final void H(aaye aayeVar, acip acipVar) {
        acipVar.aU().kk(aayeVar);
    }

    public static final void I(aayt aaytVar, acip acipVar) {
        acipVar.aW().kk(aaytVar);
    }

    static ContentValues K(aamo aamoVar) {
        ContentValues contentValues = new ContentValues();
        if (aamoVar != null) {
            Object obj = aamoVar.e;
            aohb aohbVar = (aohb) obj;
            aqmh aqmhVar = aohbVar.d;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            if (aqmhVar.c.size() > 2) {
                aihf builder = ((aihn) obj).toBuilder();
                aqmh aqmhVar2 = aohbVar.d;
                if (aqmhVar2 == null) {
                    aqmhVar2 = aqmh.a;
                }
                aqmh aqmhVarF = aajg.f(aqmhVar2, agke.r(240, 480));
                builder.copyOnWrite();
                aohb aohbVar2 = (aohb) builder.instance;
                aqmhVarF.getClass();
                aohbVar2.d = aqmhVarF;
                aohbVar2.b |= 2;
                obj = (aohb) builder.build();
            }
            contentValues.put("id", aamoVar.d());
            contentValues.put("offline_video_data_proto", ((aifs) obj).toByteArray());
            contentValues.put("deleted", Boolean.valueOf(aamoVar.a));
            Object obj2 = aamoVar.b;
            if (obj2 != null) {
                contentValues.put("channel_id", (String) ((aaok) obj2).b);
            }
        }
        return contentValues;
    }

    public static ahek a(Set set) {
        ListenableFuture listenableFutureM;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                listenableFutureM = ((afhu) it.next()).a();
                arrayList.add(listenableFutureM);
            } catch (Exception e) {
                listenableFutureM = ahng.m(e);
            }
            afjn.d(117, listenableFutureM, "AccountEnabledInterceptor Failed", new Object[0]);
        }
        return new ahek(false, agke.j(arrayList));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void A(aazk aazkVar) {
        for (acii aciiVar : this.d) {
            if (!aciiVar.L()) {
                aciiVar.g(aazkVar);
            }
        }
        ((tbt) this.e).c(aazkVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void B(aazn aaznVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).h(aaznVar);
        }
        ((tbt) this.e).c(aaznVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final void C(acip acipVar, aazk aazkVar, int i) {
        for (acii aciiVar : this.d) {
            if (aciiVar.L()) {
                aciiVar.g(aazkVar);
            }
        }
        if (i == 4) {
            acipVar.aA().kk(aazkVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    public final void D(aboe aboeVar, acip acipVar, int i) {
        if (i == 4) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((acii) it.next()).u(aboeVar);
            }
        }
        acipVar.aN().kk(aboeVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final void E(acip acipVar, aazk aazkVar, int i) {
        for (acii aciiVar : this.d) {
            if (!aciiVar.L()) {
                aciiVar.g(aazkVar);
            }
        }
        if (i == 4) {
            acipVar.bg().kk(aazkVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void F(aazn aaznVar, int i, acip acipVar) {
        if (i == 2 || i == 4) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((acii) it.next()).h(aaznVar);
            }
        }
        if (i == 3 || i == 4) {
            if (acipVar != null) {
                acipVar.bj().kk(aaznVar);
            } else {
                ((tbt) this.e).c(aaznVar);
            }
        }
    }

    public final long J(String str) {
        Cursor cursorQuery = aa().query("videosV2", new String[]{"video_added_timestamp"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            return cursorQuery.moveToNext() ? cursorQuery.getLong(0) : 0L;
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, tqj] */
    public final wjf L(String str) {
        wjf wjfVarAX;
        Cursor cursorQuery = aa().query("videosV2", new String[]{"player_response_proto"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (cursorQuery.moveToNext()) {
                ?? r10 = this.a;
                cursorQuery.getClass();
                wjfVarAX = zik.aX(cursorQuery, cursorQuery.getColumnIndexOrThrow("player_response_proto"), r10);
            } else {
                wjfVarAX = null;
            }
            return wjfVarAX;
        } finally {
            cursorQuery.close();
        }
    }

    public final aamg M(String str) {
        Cursor cursorRawQuery = aa().rawQuery("SELECT media_status FROM videosV2 WHERE id = ?", new String[]{str});
        try {
            return cursorRawQuery.moveToNext() ? aamg.a(cursorRawQuery.getInt(0)) : null;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [awmd, java.lang.Object] */
    public final aamo N(String str) {
        aamo aamoVarA;
        Cursor cursorQuery = aa().query("videosV2", aagi.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (cursorQuery.moveToNext()) {
                aalf aalfVar = (aalf) this.f.io();
                Object obj = this.d;
                cursorQuery.getClass();
                aalfVar.getClass();
                aamoVarA = aafz.a(cursorQuery, aalfVar, (axfd) obj, cursorQuery.getColumnIndexOrThrow("id"), cursorQuery.getColumnIndexOrThrow("offline_video_data_proto"), cursorQuery.getColumnIndexOrThrow("deleted"), cursorQuery.getColumnIndexOrThrow("channel_id"), cursorQuery.getColumnIndex("video_id"));
            } else {
                aamoVarA = null;
            }
            return aamoVarA;
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void O(aagh aaghVar) {
        this.g.add(aaghVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final void P(wjf wjfVar) {
        Object obj;
        String strG = wjfVar.G();
        aamo aamoVarN = N(strG);
        if (aamoVarN != null && (obj = aamoVarN.c) != null) {
            abuz abuzVar = (abuz) obj;
            if (!abuzVar.b.isEmpty()) {
                abuz abuzVarW = ((aalf) this.f.io()).w(strG, abuzVar);
                if (!abuzVarW.b.isEmpty()) {
                    wjfVar.ag(abuzVarW);
                }
            }
        }
        wjfVar.ag(((aalf) this.f.io()).w(strG, wjfVar.af()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final void Q(String str) {
        if (((aauk) this.c).t()) {
            ((wcn) this.h.io()).e().a(wfs.g(119, str)).b().G();
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    public final void R(aamo aamoVar) {
        String strD = aamoVar.d();
        long jDelete = aa().delete("videosV2", "id = ?", new String[]{strD});
        if (jDelete != 1) {
            throw new SQLException(a.cf(jDelete, "Delete video affected ", " rows"));
        }
        Q(strD);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((aagh) it.next()).a(aamoVar);
        }
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, mbc] */
    public final void S(aamo aamoVar, aamn aamnVar, aohx aohxVar, aodp aodpVar, int i, byte[] bArr, aamg aamgVar) {
        if (!X(aamoVar.d())) {
            Z(aamoVar, aamgVar, aamnVar, aaus.a(aohxVar, 360), aodpVar, i, this.e.f().toEpochMilli(), bArr);
            return;
        }
        aamg aamgVar2 = aamg.ACTIVE;
        if (aamgVar == aamgVar2 && (M(aamoVar.d()) == aamg.STREAM_DOWNLOAD_PENDING || M(aamoVar.d()) == aamg.METADATA_ONLY)) {
            U(aamoVar.d(), aamgVar2);
        } else {
            V(aamoVar);
        }
    }

    public final void T(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("video_added_timestamp", Long.valueOf(j));
        long jUpdate = aa().update("videosV2", contentValues, "id = ?", new String[]{str});
        if (jUpdate != 1) {
            throw new SQLException(a.cf(jUpdate, "Update video video_added_timestamp affected ", " rows"));
        }
    }

    public final void U(String str, aamg aamgVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_status", Integer.valueOf(aamgVar.p));
        long jUpdate = aa().update("videosV2", contentValues, "id = ?", new String[]{str});
        if (jUpdate != 1) {
            throw new SQLException(a.cf(jUpdate, "Update video media status affected ", " rows"));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mbc] */
    public final void V(aamo aamoVar) {
        Instant instantF = this.e.f();
        ContentValues contentValuesK = K(aamoVar);
        contentValuesK.put("metadata_timestamp", Long.valueOf(instantF.toEpochMilli()));
        long jUpdate = aa().update("videosV2", contentValuesK, "id = ?", new String[]{aamoVar.d()});
        if (jUpdate != 1) {
            throw new SQLException(a.cf(jUpdate, "Update video affected ", " rows"));
        }
    }

    public final void W(String str, wjf wjfVar, long j, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("player_response_proto", wjfVar.ac());
        aogq aogqVarV = wjfVar.v();
        String str2 = null;
        if (aogqVarV != null && (aogqVarV.b & 1) != 0) {
            str2 = aogqVarV.e;
        }
        if (str2 != null) {
            contentValues.put("refresh_token", str2);
        } else {
            contentValues.putNull("refresh_token");
        }
        contentValues.put("saved_timestamp", Long.valueOf(j));
        contentValues.put("last_refresh_timestamp", Long.valueOf(j2));
        long jUpdate = aa().update("videosV2", contentValues, "id = ?", new String[]{str});
        if (jUpdate != 1) {
            throw new SQLException(a.cf(jUpdate, "Update video player_response_proto affected ", " rows"));
        }
    }

    public final boolean X(String str) {
        return tbd.a(aa(), "videosV2", "id = ?", new String[]{str}) > 0;
    }

    public final boolean Y(String str, boolean z) {
        if (X(str)) {
            return z && (M(str) == aamg.STREAM_DOWNLOAD_PENDING || M(str) == aamg.METADATA_ONLY);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mbc] */
    public final void Z(aamo aamoVar, aamg aamgVar, aamn aamnVar, int i, aodp aodpVar, int i2, long j, byte[] bArr) {
        ContentValues contentValuesK = K(aamoVar);
        contentValuesK.put("metadata_timestamp", Long.valueOf(this.e.f().toEpochMilli()));
        contentValuesK.put("media_status", Integer.valueOf(aamgVar.p));
        contentValuesK.put("stream_transfer_condition", Integer.valueOf(aamnVar.h));
        contentValuesK.put("preferred_stream_quality", Integer.valueOf(i));
        contentValuesK.put(gzj.OFFLINE_AUDIO_QUALITY, Integer.valueOf(aodpVar.e));
        contentValuesK.put("video_added_timestamp", Long.valueOf(j));
        contentValuesK.put("offline_source_ve_type", Integer.valueOf(i2));
        if (bArr != null) {
            contentValuesK.put("player_response_tracking_params", bArr);
        }
        aa().insertOrThrow("videosV2", null, contentValuesK);
    }

    public final SQLiteDatabase aa() {
        return ((aaev) this.b).d();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean ab(String str) {
        return this.d.containsKey(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    public final vrt ac(xgn xgnVar) {
        Context context = (Context) this.d.io();
        context.getClass();
        acxt acxtVar = (acxt) this.h.io();
        acxtVar.getClass();
        acxn acxnVar = (acxn) this.g.io();
        acxnVar.getClass();
        nuc nucVar = (nuc) this.b.io();
        nucVar.getClass();
        wjr wjrVar = (wjr) this.e.io();
        wjrVar.getClass();
        vxz vxzVar = (vxz) this.f.io();
        vxzVar.getClass();
        vxz vxzVar2 = (vxz) this.a.io();
        vxzVar2.getClass();
        xgnVar.getClass();
        return new vrt(context, acxtVar, this.c, acxnVar, nucVar, wjrVar, vxzVar, vxzVar2, xgnVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aunn, java.lang.Object] */
    public final vos ad(xgn xgnVar, amdd amddVar, akrn akrnVar, String str) {
        Context context = (Context) this.h.io();
        context.getClass();
        acxt acxtVar = (acxt) this.b.io();
        acxtVar.getClass();
        aeas aeasVar = (aeas) this.e.io();
        ?? Io = this.c.io();
        Io.getClass();
        ?? Io2 = this.d.io();
        Io2.getClass();
        ?? Io3 = this.g.io();
        Io3.getClass();
        vxz vxzVar = (vxz) this.a.io();
        vxzVar.getClass();
        vxz vxzVar2 = (vxz) this.f.io();
        vxzVar2.getClass();
        xgnVar.getClass();
        akrnVar.getClass();
        return new vos(context, acxtVar, aeasVar, Io, Io2, Io3, vxzVar, vxzVar2, xgnVar, amddVar, akrnVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final wjr ae(String str) {
        return (wjr) this.d.get(str);
    }

    public final Context b() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper((Context) this.b, ((tza) this.a).a);
        c(contextThemeWrapper, (ajet) this.d);
        return contextThemeWrapper;
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [awmi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [awmd, java.lang.Object] */
    public final void c(Context context, ajet ajetVar) {
        Integer numValueOf;
        ajet ajetVar2 = ajet.USER_INTERFACE_THEME_DARK;
        if (ajetVar.equals(ajetVar2)) {
            context.getTheme().applyStyle(R.style.CairoDarkThemeUpdates, true);
        } else {
            context.getTheme().applyStyle(R.style.CairoLightThemeUpdates, true);
        }
        if (((vxz) this.h.io()).l(79, 45763021L, false)) {
            aciz acizVar = (aciz) this.g.io();
            aihf aihfVarCreateBuilder = arqm.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            int i = ajetVar == ajetVar2 ? 3 : 4;
            aihfVarCreateBuilder.copyOnWrite();
            arqm arqmVar = (arqm) aihfVarCreateBuilder.instance;
            arqmVar.d = i - 2;
            arqmVar.b |= 4;
            aihfVarCreateBuilder.copyOnWrite();
            arqm arqmVar2 = (arqm) aihfVarCreateBuilder.instance;
            arqmVar2.c = 2;
            arqmVar2.b |= 2;
            int i2 = true == ((Boolean) acizVar.a.a()).booleanValue() ? 4 : 3;
            aihfVarCreateBuilder.copyOnWrite();
            arqm arqmVar3 = (arqm) aihfVarCreateBuilder.instance;
            arqmVar3.e = i2 - 2;
            arqmVar3.b |= 8;
            aihn aihnVarBuild = aihfVarCreateBuilder.build();
            aihnVarBuild.getClass();
            arqm arqmVar4 = (arqm) aihnVarBuild;
            context.getClass();
            int iAT = a.aT(arqmVar4.d);
            if (iAT == 0) {
                iAT = 1;
            }
            int i3 = iAT - 2;
            if (i3 == 1) {
                int iAT2 = a.aT(arqmVar4.e);
                if (iAT2 == 0) {
                    iAT2 = 1;
                }
                numValueOf = iAT2 + (-2) == 2 ? Integer.valueOf(R.style.yt_sys_measurement_dark_button_medium) : null;
                if (numValueOf != null) {
                    numValueOf.intValue();
                    context.getTheme().applyStyle(R.style.yt_sys_measurement_dark_button_medium, true);
                }
            } else if (i3 == 2) {
                int iAT3 = a.aT(arqmVar4.e);
                if (iAT3 == 0) {
                    iAT3 = 1;
                }
                numValueOf = iAT3 + (-2) == 2 ? Integer.valueOf(R.style.yt_sys_measurement_button_medium) : null;
                if (numValueOf != null) {
                    numValueOf.intValue();
                    context.getTheme().applyStyle(R.style.yt_sys_measurement_button_medium, true);
                }
            }
        }
        if (((vxz) this.e).l(403, 45832757L, false)) {
            context.getTheme().applyStyle(R.style.TypographyTokensEnabled, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [awmd, java.lang.Object] */
    public final aeaa d(TextView textView) {
        vxe vxeVar = (vxe) this.a.io();
        vxeVar.getClass();
        aduv aduvVar = (aduv) this.d.io();
        aduvVar.getClass();
        adxj adxjVar = (adxj) this.h.io();
        adxjVar.getClass();
        ci ciVar = (ci) this.g.io();
        lqa lqaVar = (lqa) this.b.io();
        lqaVar.getClass();
        aciz acizVar = (aciz) this.f.io();
        acizVar.getClass();
        adxl adxlVar = (adxl) this.c.io();
        adxlVar.getClass();
        aeda aedaVar = (aeda) this.e.io();
        aedaVar.getClass();
        textView.getClass();
        return new aeaa(vxeVar, aduvVar, adxjVar, ciVar, lqaVar, acizVar, adxlVar, aedaVar, textView);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [awmd, java.lang.Object] */
    public final adfx e(xgn xgnVar) {
        ((Context) this.b.io()).getClass();
        ((abxu) this.d.io()).getClass();
        xgnVar.getClass();
        vxz vxzVar = (vxz) this.g.io();
        vxzVar.getClass();
        vxz vxzVar2 = (vxz) this.c.io();
        vxzVar2.getClass();
        vxz vxzVar3 = (vxz) this.f.io();
        vxzVar3.getClass();
        ((vxz) this.h.io()).getClass();
        vxz vxzVar4 = (vxz) this.e.io();
        tqj tqjVar = (tqj) this.a.io();
        tqjVar.getClass();
        return new adfx(vxzVar, vxzVar2, vxzVar3, vxzVar4, tqjVar, xgnVar, null, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [awmd, java.lang.Object] */
    public final adfx f(xgn xgnVar, akrn akrnVar) {
        ((Context) this.b.io()).getClass();
        ((abxu) this.d.io()).getClass();
        xgnVar.getClass();
        vxz vxzVar = (vxz) this.g.io();
        vxzVar.getClass();
        vxz vxzVar2 = (vxz) this.c.io();
        vxzVar2.getClass();
        vxz vxzVar3 = (vxz) this.f.io();
        vxzVar3.getClass();
        ((vxz) this.h.io()).getClass();
        vxz vxzVar4 = (vxz) this.e.io();
        tqj tqjVar = (tqj) this.a.io();
        tqjVar.getClass();
        return new adfx(vxzVar, vxzVar2, vxzVar3, vxzVar4, tqjVar, xgnVar, akrnVar, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [axsp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [axsp, java.lang.Object] */
    public final void g() {
        ?? r0 = this.h;
        aazq aazqVar = aazq.a;
        r0.kk(aazqVar);
        this.b.kk(aazqVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [axsp, java.lang.Object] */
    public final void h(acip acipVar) {
        this.b.kk(new aazq(acipVar));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Set] */
    public final void i(String str, long j, long j2) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).o(str, j, j2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final void j(zhz zhzVar, acip acipVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).p(zhzVar, acipVar.au());
        }
        acipVar.aD().kk(zhzVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [axsp, java.lang.Object] */
    public final void k(String str) {
        this.c.kk(new aazp(str));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    public final void l(aaxd aaxdVar, acip acipVar) {
        acipVar.aF().kk(aaxdVar);
        for (acii aciiVar : this.d) {
            if (aaxdVar.d) {
                aciiVar.W(aaxdVar.c, acipVar.au(), aaxdVar.b);
            } else {
                aciiVar.m(aaxdVar.c, acipVar.au());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    public final void m(aaxt aaxtVar, acip acipVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).K(aaxtVar, acipVar.f(), acipVar.au());
        }
        acipVar.aG().kk(aaxtVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void n(String str) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).t(str);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final void o(aaxh aaxhVar, acip acipVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).X(aaxhVar, acipVar.a());
        }
        acipVar.aJ().kk(aaxhVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [axsp, java.lang.Object] */
    public final void p(acip acipVar) {
        this.h.kk(new aazq(acipVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [axsp, java.lang.Object] */
    public final void q(acip acipVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).s(acipVar.au(), acipVar.n());
        }
        ((tbt) this.e).f(acipVar.p());
        this.g.kk(new aazr(acipVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v40, types: [axsp, java.lang.Object] */
    public final void r(acip acipVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).e(acipVar.au());
        }
        acipVar.aT().kn();
        acipVar.bi().kn();
        acipVar.bg().kn();
        acipVar.aA().kn();
        acipVar.az().kn();
        acipVar.aD().kn();
        acipVar.bf().kn();
        acipVar.aW().kn();
        acipVar.ay().kn();
        acipVar.aF().kn();
        acipVar.aJ().kn();
        acipVar.aV().kn();
        acipVar.aU().kn();
        acipVar.aX().kn();
        acipVar.bb().kn();
        acipVar.be().kn();
        acipVar.bj().kn();
        acipVar.aB().kn();
        acipVar.aN().kn();
        acipVar.aP().kn();
        acipVar.bc().kn();
        acipVar.bd().kn();
        acipVar.av().kn();
        acipVar.aE().kn();
        acipVar.ax().kn();
        acipVar.ba().kn();
        acipVar.aM().kn();
        acipVar.aS().kn();
        acipVar.aQ().kn();
        acipVar.aH().kn();
        acipVar.aw().kn();
        acipVar.aO().kn();
        acipVar.aG().kn();
        acipVar.aI().kn();
        acipVar.aL().kn();
        acipVar.aU().kn();
        acipVar.aK().kn();
        acipVar.as().ki(new aaxf());
        this.f.kk(new aazs(acipVar));
        ((tbt) this.e).l(acipVar.p());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void s(String str, String str2, boolean z, String str3) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).v(str, str2, z, str3);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void t(String str, String str2) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).x(str, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void u() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void v(aazj aazjVar, acip acipVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).f(aazjVar);
        }
        if (acipVar != null) {
            acipVar.bf().kk(aazjVar);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final void w(aaxl aaxlVar, acip acipVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).b(acipVar.au());
        }
        acipVar.aP().kk(aaxlVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void x(yvu yvuVar, String str) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).j(yvuVar, str);
        }
        ((tbt) this.e).c(yvuVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final void y(aazk aazkVar) {
        for (acii aciiVar : this.d) {
            if (aciiVar.L()) {
                aciiVar.g(aazkVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void z(aazj aazjVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).f(aazjVar);
        }
        ((tbt) this.e).c(aazjVar);
    }

    public afip(abxv abxvVar, zgm zgmVar, aunn aunnVar, xeu xeuVar, ExecutorImpl executorImpl, avlh avlhVar, avlh avlhVar2, avmb avmbVar) {
        this.b = abxvVar;
        this.h = zgmVar;
        this.c = aunnVar;
        this.d = xeuVar;
        this.g = executorImpl;
        this.e = avlhVar;
        this.a = avlhVar2;
        this.f = avmbVar;
    }

    public afip(Activity activity, ajet ajetVar, tza tzaVar, tza tzaVar2, awmd awmdVar, vxz vxzVar, awmd awmdVar2, awmd awmdVar3) {
        this.b = activity;
        this.d = ajetVar;
        this.a = tzaVar;
        this.c = tzaVar2;
        this.h = awmdVar;
        this.e = vxzVar;
        this.g = awmdVar2;
        this.f = awmdVar3;
    }

    public afip(aaev aaevVar, awmd awmdVar, awmd awmdVar2, mbc mbcVar, axfd axfdVar, aauk aaukVar, tqj tqjVar) {
        this.b = aaevVar;
        this.h = awmdVar;
        this.f = awmdVar2;
        this.e = mbcVar;
        this.d = axfdVar;
        this.c = aaukVar;
        this.a = tqjVar;
        aaukVar.b.l(24, 45370274L, false);
        aaukVar.t();
        this.g = new ArrayList();
    }

    public afip(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, byte[] bArr, char[] cArr) {
        awmdVar.getClass();
        this.h = awmdVar;
        this.b = awmdVar2;
        this.e = awmdVar3;
        this.c = awmdVar4;
        this.d = awmdVar5;
        this.g = awmdVar6;
        awmdVar7.getClass();
        this.a = awmdVar7;
        this.f = awmdVar8;
    }

    public afip(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, char[] cArr) {
        awmdVar.getClass();
        this.d = awmdVar;
        this.h = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.g = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
        this.e = awmdVar6;
        awmdVar7.getClass();
        this.f = awmdVar7;
        awmdVar8.getClass();
        this.a = awmdVar8;
    }

    public afip(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, byte[] bArr, byte[] bArr2) {
        this.b = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.g = awmdVar3;
        awmdVar4.getClass();
        this.f = awmdVar4;
        awmdVar5.getClass();
        this.h = awmdVar5;
        awmdVar6.getClass();
        this.e = awmdVar6;
        awmdVar7.getClass();
        this.c = awmdVar7;
        awmdVar8.getClass();
        this.a = awmdVar8;
    }

    public afip(abhh abhhVar, ahex ahexVar, ahex ahexVar2, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5) {
        this.a = abhhVar;
        this.b = ahexVar;
        this.c = ahexVar2;
        this.f = awmdVar;
        this.g = awmdVar2;
        this.h = awmdVar5;
        this.d = awmdVar3;
        this.e = awmdVar4;
    }

    public afip(tbt tbtVar, Set set, axsp axspVar, axsp axspVar2, axsp axspVar3, axsp axspVar4, axsp axspVar5, abmt abmtVar) {
        tbtVar.getClass();
        this.e = tbtVar;
        set.getClass();
        this.d = set;
        axspVar.getClass();
        this.g = axspVar;
        axspVar2.getClass();
        this.f = axspVar2;
        axspVar3.getClass();
        this.b = axspVar3;
        axspVar4.getClass();
        this.h = axspVar4;
        axspVar5.getClass();
        this.c = axspVar5;
        abmtVar.getClass();
        this.a = abmtVar;
    }

    public afip(dov dovVar, wmo wmoVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, mbc mbcVar, vxz vxzVar) {
        dovVar.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
        awmdVar3.getClass();
        awmdVar4.getClass();
        mbcVar.getClass();
        vxzVar.getClass();
        this.c = dovVar;
        this.b = wmoVar;
        this.e = awmdVar;
        this.d = awmdVar2;
        this.f = awmdVar3;
        this.a = awmdVar4;
        this.g = mbcVar;
        this.h = vxzVar;
    }

    public afip(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, byte[] bArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        this.g = awmdVar3;
        this.c = awmdVar4;
        awmdVar5.getClass();
        this.f = awmdVar5;
        awmdVar6.getClass();
        this.h = awmdVar6;
        this.e = awmdVar7;
        awmdVar8.getClass();
        this.a = awmdVar8;
    }

    public afip(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8) {
        awmdVar.getClass();
        this.a = awmdVar;
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.h = awmdVar3;
        awmdVar4.getClass();
        this.g = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
        awmdVar7.getClass();
        this.c = awmdVar7;
        awmdVar8.getClass();
        this.e = awmdVar8;
    }
}
