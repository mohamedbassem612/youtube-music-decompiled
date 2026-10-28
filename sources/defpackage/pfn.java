package defpackage;

import android.content.Context;
import com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase;
import com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pfn implements ple {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pfn(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [awmd, java.lang.Object] */
    @Override // defpackage.ple
    public final Object a(plx plxVar) {
        int i = this.$cid;
        if (i == 0) {
            Object objValueOf = plxVar != null ? Long.valueOf(plxVar.a) : "device_level";
            ?? r0 = this.b;
            Object obj = this.a;
            Objects.toString(objValueOf);
            dmo dmoVarG = azt.g((Context) obj, ChimePerAccountRoomDatabase.class, "".concat(objValueOf.toString().concat("_room_notifications.db")));
            dmoVarG.d(r0);
            return (ChimePerAccountRoomDatabase) dmoVarG.a();
        }
        if (i != 1) {
            GnpPerAccountRoomDatabase gnpPerAccountRoomDatabase = (GnpPerAccountRoomDatabase) ((tld) this.a).C(plxVar);
            gnpPerAccountRoomDatabase.getClass();
            tld tldVar = (tld) this.b;
            awou awouVar = (awou) tldVar.a.io();
            awouVar.getClass();
            mbc mbcVar = (mbc) tldVar.b.io();
            mbcVar.getClass();
            return new pvr(gnpPerAccountRoomDatabase, awouVar, mbcVar);
        }
        ChimePerAccountRoomDatabase chimePerAccountRoomDatabase = (ChimePerAccountRoomDatabase) ((tld) this.b).C(plxVar);
        chimePerAccountRoomDatabase.getClass();
        tld tldVar2 = (tld) this.a;
        awou awouVar2 = (awou) tldVar2.a.io();
        awouVar2.getClass();
        mbc mbcVar2 = (mbc) tldVar2.b.io();
        mbcVar2.getClass();
        return new pfu(chimePerAccountRoomDatabase, awouVar2, mbcVar2);
    }

    public /* synthetic */ pfn(tld tldVar, tld tldVar2, int i) {
        this.$cid = i;
        this.b = tldVar;
        this.a = tldVar2;
    }
}
