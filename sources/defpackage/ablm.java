package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.proto.streaming.ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ablm implements yxb {
    public volatile acjb b;
    public final Map c = new HashMap();
    public volatile ablp d;
    public final abmt e;
    public Integer f;
    public boolean g;

    public ablm(avlh avlhVar, abmt abmtVar) {
        this.e = abmtVar;
        avmm avmmVar = new avmm();
        avmmVar.c(avlhVar.i(new abwr(1)).ak(new abll(this, 1)));
        avmmVar.c(aawb.w(avlhVar, new abfb(6)).i(new abwr(1)).ak(new abll(this, 0)));
        avmmVar.c(aawb.w(avlhVar, new abfb(7)).ak(new abll(this, 2)));
    }

    private final aciw e(long j, boolean z) {
        aciw aciwVarT = this.b.t(j);
        if (aciwVarT == null && this.g) {
            aciwVarT = this.b.t(j - ahbt.b(this.f.intValue()).toMillis());
        }
        if (aciwVarT != null) {
            return aciwVarT;
        }
        abmt abmtVar = this.e;
        long jO = 3000;
        if (abmtVar.o() > 0 && z) {
            jO = abmtVar.o();
        }
        return this.b.t(j + jO);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    @Override // defpackage.yxb
    public final synchronized Uri a(wgs wgsVar, long j, long j2) {
        String str;
        wjf wjfVar;
        Object obj;
        String strJoin;
        if (this.b != null && j >= 0 && j2 >= 0) {
            aciw aciwVarE = e(j2, false);
            if (aciwVarE != null && (((str = aciwVarE.a().l) == null || !this.d.e(str)) && (wjfVar = aciwVarE.i) != null && wjfVar.g() != null && !wjfVar.f().aA())) {
                List<wgs> list = wjfVar.g().t;
                int iE = wgsVar.e();
                for (wgs wgsVar2 : list) {
                    if (wgsVar2.e() == iE) {
                        tyt tytVar = new tyt(wgsVar2.e);
                        zj zjVar = (zj) this.c.get(Long.valueOf(j - 1));
                        if (zjVar == null) {
                            obj = "";
                        } else if (wgsVar.af() && !((String) zjVar.b).isEmpty()) {
                            obj = zjVar.b;
                        } else if (wgsVar.I() && !((String) zjVar.a).isEmpty()) {
                            obj = zjVar.a;
                        } else if (wgsVar.I() || wgsVar.af() || ((String) zjVar.c).isEmpty()) {
                            obj = "";
                        } else {
                            obj = zjVar.c;
                        }
                        if (!((String) obj).isEmpty()) {
                            tytVar.e("daistate", (String) obj);
                        }
                        agke agkeVarE = aciwVarE.a().E();
                        if (agkeVarE.isEmpty()) {
                            strJoin = "";
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int size = agkeVarE.size();
                            for (int i = 0; i < size; i++) {
                                arrayList.add(((acjd) agkeVarE.get(i)).b());
                            }
                            strJoin = TextUtils.join(",", arrayList);
                        }
                        if (!strJoin.isEmpty()) {
                            tytVar.g("acpns", strJoin, ",");
                        }
                        return tytVar.a();
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.yxb
    public final ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo b(long j) {
        aciw aciwVarE;
        aigj aigjVar;
        String str;
        if (this.b == null || (aciwVarE = e(j, true)) == null || (aigjVar = aciwVarE.k) == null || ((str = aciwVarE.a().l) != null && this.d.e(str))) {
            return null;
        }
        agke agkeVarE = aciwVarE.a().E();
        ArrayList arrayList = new ArrayList();
        int size = agkeVarE.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((acjd) agkeVarE.get(i)).b());
        }
        aihf aihfVarCreateBuilder = ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo serverStitchedDaiInfoOuterClass$ServerStitchedDaiInfo = (ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo) aihfVarCreateBuilder.instance;
        serverStitchedDaiInfoOuterClass$ServerStitchedDaiInfo.b |= 1;
        serverStitchedDaiInfoOuterClass$ServerStitchedDaiInfo.d = aigjVar;
        aihfVarCreateBuilder.copyOnWrite();
        ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo serverStitchedDaiInfoOuterClass$ServerStitchedDaiInfo2 = (ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo) aihfVarCreateBuilder.instance;
        aiie aiieVar = serverStitchedDaiInfoOuterClass$ServerStitchedDaiInfo2.c;
        if (!aiieVar.c()) {
            serverStitchedDaiInfoOuterClass$ServerStitchedDaiInfo2.c = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(arrayList, serverStitchedDaiInfoOuterClass$ServerStitchedDaiInfo2.c);
        return (ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.yxb
    public final boolean c(long j) {
        if (this.d == null) {
            return false;
        }
        return this.d.f(j);
    }

    public final synchronized void d(aawz aawzVar) {
        if (aawzVar != null) {
            aawy aawyVar = aawzVar.c;
            String strD = aawyVar != null ? aawyVar.a.d("Serialized-State") : null;
            if (strD != null) {
                long j = aawzVar.a;
                if (j > 0) {
                    zj zjVar = (zj) j$.util.Map.EL.computeIfAbsent(this.c, Long.valueOf(j), new aalr(17));
                    if (aawzVar.e) {
                        zjVar.b = strD;
                    } else if (aawzVar.d) {
                        zjVar.a = strD;
                    } else {
                        zjVar.c = strD;
                    }
                }
            }
            ahha ahhaVar = aawzVar.f;
            if (ahhaVar != null) {
                Integer numB = ((ywx) ahhaVar.a).b("Target-Duration-Us");
                if (numB == null) {
                    numB = this.f;
                }
                this.f = numB;
            }
        }
    }
}
