package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import internal.org.jni_zero.JniZero;
import j$.time.Duration;
import j$.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class apm implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ apm(int i) {
        this.$cid = i;
        this.b = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)";
        this.a = "transfer_dm2";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [bog, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [awuz, java.lang.Object] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) throws Exception {
        switch (this.$cid) {
            case 0:
                apr.b((View) this.a, (anq) this.b);
                return awmy.a;
            case 1:
                apr.b((View) this.a, (anq) this.b);
                throw null;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                bof bofVar = (bof) entry.getKey();
                ahto ahtoVar = (ahto) entry.getValue();
                while (true) {
                    boh bohVar = (boh) this.a;
                    if (((bob) ahtoVar.c).compareTo(bohVar.d) > 0 && !bohVar.b && bohVar.e.f(bofVar)) {
                        bnz bnzVar = boa.Companion;
                        boa boaVarA = bnz.a((bob) ahtoVar.c);
                        if (boaVarA == null) {
                            Object obj2 = ahtoVar.c;
                            Objects.toString(obj2);
                            throw new IllegalStateException("no event down from ".concat(String.valueOf(obj2)));
                        }
                        ?? r3 = this.b;
                        List list = bohVar.c;
                        list.add(boaVarA.a());
                        ahtoVar.i(r3, boaVarA);
                        atqq.aF(list);
                    }
                }
                return awmy.a;
            case 3:
                bpv bpvVar = (bpv) obj;
                bpvVar.getClass();
                bpe bpeVar = (bpe) this.b;
                bpvVar.b(bpd.a, bpeVar.a);
                bpvVar.b(bpd.b, bpeVar.b);
                bpvVar.b(bpn.a, this.a);
                Bundle bundle = bpeVar.c;
                if (bundle != null) {
                    bpvVar.b(bpd.c, bundle);
                }
                return awmy.a;
            case 4:
                Throwable th = (Throwable) obj;
                Object obj3 = this.b;
                if (th == null) {
                    ((aqi) obj3).b(this.a.f());
                } else if (th instanceof CancellationException) {
                    ((aqi) obj3).c();
                } else {
                    ((aqi) obj3).d(th);
                }
                return awmy.a;
            case 5:
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                ((edy) this.a).a.d(dptVar, this.b);
                return awmy.a;
            case 6:
                return Boolean.valueOf(eol.e((String) this.b, (String) this.a, (dpt) obj));
            case 7:
                return Boolean.valueOf(eol.e((String) this.b, (String) this.a, (dpt) obj));
            case 8:
                afv afvVar = (afv) obj;
                afvVar.getClass();
                ((eef) this.a).b((dpt) this.b, afvVar);
                return awmy.a;
            case 9:
                afv afvVar2 = (afv) obj;
                afvVar2.getClass();
                ((eef) this.a).c((dpt) this.b, afvVar2);
                return awmy.a;
            case 10:
                return eol.a((String) this.b, (String) this.a, (dpt) obj);
            case 11:
                return Integer.valueOf(eol.c((String) this.b, (String) this.a, (dpt) obj));
            case 12:
                return eol.b((String) this.b, (String) this.a, (dpt) obj);
            case 13:
                return Boolean.valueOf(eol.e((String) this.b, (String) this.a, (dpt) obj));
            case 14:
                return eol.a((String) this.b, (String) this.a, (dpt) obj);
            case 15:
                akeo akeoVar = (akeo) obj;
                String continuationToken = akeoVar != null ? akeoVar.getContinuationToken() : null;
                if (continuationToken != null && continuationToken.length() != 0) {
                    Object obj4 = this.a;
                    Object obj5 = this.b;
                    String str = ((apoy) obj4).e;
                    str.getClass();
                    aihf aihfVarCreateBuilder = apho.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    aihfVarCreateBuilder.copyOnWrite();
                    apho aphoVar = (apho) aihfVarCreateBuilder.instance;
                    aphoVar.c |= 1;
                    aphoVar.d = continuationToken;
                    aihn aihnVarBuild = aihfVarCreateBuilder.build();
                    aihnVarBuild.getClass();
                    ((gvj) obj5).a.s(new gvk(str, (apho) aihnVarBuild));
                }
                return awmy.a;
            case 16:
                tau tauVar = (tau) obj;
                tauVar.getClass();
                ((xsc) this.b).aC((zne) this.a, tauVar);
                return awmy.a;
            case 17:
                aret aretVar = (aret) obj;
                aretVar.getClass();
                Duration durationS = ((ieq) this.b).f.s();
                durationS.getClass();
                return Boolean.valueOf(!ugi.f(aretVar, (Instant) this.a, durationS));
            case 18:
                DirectUpdateDataRelay directUpdateDataRelay = (DirectUpdateDataRelay) obj;
                agrf agrfVar = jah.a;
                directUpdateDataRelay.getClass();
                directUpdateDataRelay.send((String) this.b, ixt.e(((Number) ((awrm) this.a).a).floatValue()));
                return awmy.a;
            case 19:
                if (((yy) obj).a()) {
                    maj.b((maj) this.b, (ainv) this.a);
                }
                return awmy.a;
            default:
                dpt dptVar2 = (dpt) obj;
                dptVar2.getClass();
                dma dmaVar = ((pgh) this.a).b;
                Object obj6 = this.b;
                dpb dpbVarA = dptVar2.a("INSERT OR IGNORE INTO `chime_thread_states` (`id`,`thread_id`,`last_updated_version`,`read_state`,`deletion_status`,`count_behavior`,`system_tray_behavior`,`modified_timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)");
                try {
                    dmaVar.b(dpbVarA, obj6);
                    dpbVarA.l();
                    JniZero.j(dpbVarA, null);
                    return Long.valueOf(ape.o(dptVar2));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        JniZero.j(dpbVarA, th2);
                        throw th3;
                    }
                }
        }
    }

    public /* synthetic */ apm(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ apm(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ apm(String str, int i) {
        this.$cid = i;
        this.b = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?";
        this.a = str;
    }

    public /* synthetic */ apm(String str, int i, byte[] bArr) {
        this.$cid = i;
        this.b = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        this.a = str;
    }

    public /* synthetic */ apm(String str, int i, char[] cArr) {
        this.$cid = i;
        this.b = "SELECT name FROM workname WHERE work_spec_id=?";
        this.a = str;
    }

    public /* synthetic */ apm(String str, int i, int[] iArr) {
        this.$cid = i;
        this.b = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        this.a = str;
    }

    public /* synthetic */ apm(String str, int i, short[] sArr) {
        this.$cid = i;
        this.b = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        this.a = str;
    }

    public /* synthetic */ apm(String str, int i, boolean[] zArr) {
        this.$cid = i;
        this.b = "SELECT COUNT(*) > 0 FROM workspec WHERE id=? AND state=0 AND schedule_requested_at<>-1";
        this.a = str;
    }
}
