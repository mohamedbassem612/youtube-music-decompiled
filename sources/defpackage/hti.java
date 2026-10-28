package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hti implements hto {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ htp a;

    public /* synthetic */ hti(htp htpVar, int i) {
        this.$cid = i;
        this.a = htpVar;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0202  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hto
    public final void a(hth hthVar) {
        String string;
        boolean z;
        boolean z2;
        atr atrVarF;
        byte[] bArr = null;
        if (this.$cid != 0) {
            if (hthVar.a().isEmpty()) {
                return;
            }
            htp htpVar = this.a;
            if (hthVar.b().isPresent()) {
                anyo anyoVar = (anyo) hthVar.b().get();
                if (anyoVar.e()) {
                    Set set = htpVar.j;
                    if (set.remove(wfs.h(anyoVar.b())) && set.isEmpty()) {
                        htpVar.h("ytm_smart_downloads");
                        return;
                    }
                    return;
                }
            }
            hpd hpdVar = htpVar.f;
            boolean zQ = hpdVar.q(hthVar);
            if (!hpdVar.s(hthVar)) {
                if (!zQ) {
                    return;
                } else {
                    zQ = true;
                }
            }
            int i = true != zQ ? R.drawable.yt_fill_downloaded_white_24 : R.drawable.ic_notification_error_small;
            String strN = zQ ? hpdVar.n(hthVar) : htpVar.b.getString(R.string.notification_offline_video_completed);
            anyx anyxVar = (anyx) hthVar.a().get();
            String strH = wfs.h(anyxVar.b());
            atr atrVarF2 = htpVar.f(strH);
            atrVarF2.k(strN);
            atrVarF2.l(anyxVar.getTitle());
            atrVarF2.j(null);
            atrVarF2.q(i);
            atrVarF2.p(0, 0, false);
            atrVarF2.e(2, false);
            atrVarF2.e(16, true);
            atrVarF2.h = qof.b(htpVar.b, strH.hashCode(), htpVar.d(anyxVar), 1140850688);
            htpVar.i(strH, htp.p(anyxVar), 7, true, atrVarF2);
            return;
        }
        if (hthVar.a().isEmpty() || hthVar.b().isEmpty()) {
            return;
        }
        htp htpVar2 = this.a;
        anyx anyxVar2 = (anyx) hthVar.a().get();
        anyo anyoVar2 = (anyo) hthVar.b().get();
        String strH2 = wfs.h(anyxVar2.b());
        if (anyoVar2.e()) {
            htpVar2.j.add(strH2);
            taf.g(htpVar2.l.a(), new gov(htpVar2, hthVar, 17, bArr));
            return;
        }
        if (htpVar2.m.i()) {
            if (Objects.equals(htpVar2.f.c(hthVar), aamp.TRANSFER_PENDING_WIFI)) {
                string = (htpVar2.d.p() && htpVar2.o.z()) ? htpVar2.b.getString(R.string.waiting_for_preferred_connection) : htpVar2.b.getString(R.string.offline_waiting_for_wifi);
            } else {
                if (!hthVar.d().isPresent()) {
                    return;
                }
                agqs agqsVarListIterator = ((agke) ((aohq) hthVar.d().get()).getStreamsProgressModels()).listIterator(0);
                long jLongValue = 0;
                long jLongValue2 = 0;
                while (agqsVarListIterator.hasNext()) {
                    aqdo aqdoVar = (aqdo) agqsVarListIterator.next();
                    jLongValue += aqdoVar.a().longValue();
                    jLongValue2 += aqdoVar.b().longValue();
                }
                Context context = htpVar2.b;
                string = String.format("%s / %s", typ.g(context.getResources(), jLongValue), typ.g(context.getResources(), jLongValue2));
                z = true;
                z2 = false;
            }
            int iA = hpd.a(hthVar.d());
            atrVarF = htpVar2.f(strH2);
            atrVarF.l(anyxVar2.getTitle());
            Context context2 = htpVar2.b;
            atrVarF.j(context2.getString(R.string.percent, Integer.valueOf(iA)));
            atrVarF.k(string);
            atrVarF.q(R.drawable.yt_outline_download_white_24);
            atrVarF.p(100, iA, false);
            atrVarF.e(2, z);
            atrVarF.e(16, z2);
            atrVarF.h = qof.b(context2, strH2.hashCode(), htpVar2.d(anyxVar2), 201326592);
            if (z) {
                atrVarF.G = htp.a;
            }
            htpVar2.i(strH2, htp.p(anyxVar2), 7, false, atrVarF);
        }
        string = htpVar2.b.getString(R.string.offline_waiting_for_network);
        z2 = true;
        z = false;
        int iA2 = hpd.a(hthVar.d());
        atrVarF = htpVar2.f(strH2);
        atrVarF.l(anyxVar2.getTitle());
        Context context3 = htpVar2.b;
        atrVarF.j(context3.getString(R.string.percent, Integer.valueOf(iA2)));
        atrVarF.k(string);
        atrVarF.q(R.drawable.yt_outline_download_white_24);
        atrVarF.p(100, iA2, false);
        atrVarF.e(2, z);
        atrVarF.e(16, z2);
        atrVarF.h = qof.b(context3, strH2.hashCode(), htpVar2.d(anyxVar2), 201326592);
        if (z) {
            atrVarF.G = htp.a;
        }
        htpVar2.i(strH2, htp.p(anyxVar2), 7, false, atrVarF);
    }
}
