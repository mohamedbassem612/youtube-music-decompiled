package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class htj implements htn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ htp a;

    public /* synthetic */ htj(htp htpVar, int i) {
        this.$cid = i;
        this.a = htpVar;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01cd  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, weh] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, weh] */
    @Override // defpackage.htn
    public final void a(Optional optional, hte hteVar) {
        String quantityString;
        boolean z;
        boolean z2;
        atr atrVarF;
        String string;
        int i;
        if (this.$cid != 0) {
            if (optional.isEmpty() || hteVar == null || !hteVar.a) {
                return;
            }
            hcg hcgVar = (hcg) optional.get();
            Optional optional2 = hcgVar.a;
            if (optional2.isEmpty()) {
                return;
            }
            Optional optional3 = hcgVar.b;
            if (optional3.isEmpty()) {
                return;
            }
            htp htpVar = this.a;
            ?? r12 = optional2.get();
            weh wehVar = (weh) optional3.get();
            String strH = wfs.h(r12.b());
            if (htpVar.e.g() && hpb.q(wehVar).isPresent()) {
                Set set = htpVar.j;
                if (set.remove(strH) && set.isEmpty()) {
                    htpVar.h("ytm_smart_downloads");
                    return;
                }
                return;
            }
            boolean z3 = hteVar.b;
            String str = hcgVar.g;
            int i2 = typ.a;
            Intent intentC = htpVar.c(strH, r12 instanceof anjx);
            if (z3) {
                string = htpVar.b.getString(R.string.state_offline_playlist_tracks_not_downloaded_error);
                i = R.drawable.ic_notification_error_small;
            } else {
                string = htpVar.b.getString(R.string.notification_offline_playlist_all_tracks_downloaded);
                i = R.drawable.yt_fill_downloaded_white_24;
            }
            String strC = typ.c(str);
            atr atrVarF2 = htpVar.f(strH);
            atrVarF2.l(strC);
            atrVarF2.k(string);
            atrVarF2.j(null);
            atrVarF2.q(i);
            atrVarF2.p(0, 0, false);
            atrVarF2.e(2, false);
            atrVarF2.e(16, true);
            atrVarF2.h = qof.b(htpVar.b, strH.hashCode(), intentC, 1140850688);
            htpVar.i(strH, htp.s(hcgVar), 8, true, atrVarF2);
            return;
        }
        if (optional.isEmpty() || hteVar == null || hteVar.a) {
            return;
        }
        hcg hcgVar2 = (hcg) optional.get();
        Optional optional4 = hcgVar2.a;
        if (optional4.isPresent()) {
            Optional optional5 = hcgVar2.b;
            if (optional5.isPresent()) {
                htp htpVar2 = this.a;
                ?? r13 = optional4.get();
                weh wehVar2 = (weh) optional5.get();
                String strH2 = wfs.h(r13.b());
                if (htpVar2.e.g() && hpb.q(wehVar2).isPresent()) {
                    taf.g(htpVar2.l.a(), new gsu(htpVar2, strH2, hteVar, 17, (char[]) null));
                    return;
                }
                int i3 = hteVar.e;
                int i4 = hteVar.d;
                int i5 = hteVar.f;
                String str2 = hcgVar2.g;
                int i6 = typ.a;
                Intent intentC2 = htpVar2.c(strH2, r13 instanceof anjx);
                boolean z4 = hteVar.c;
                if (htpVar2.m.i()) {
                    if (z4) {
                        quantityString = (htpVar2.d.p() && htpVar2.o.z()) ? htpVar2.b.getString(R.string.waiting_for_preferred_connection) : htpVar2.b.getString(R.string.offline_waiting_for_wifi);
                    } else {
                        quantityString = htpVar2.b.getResources().getQuantityString(R.plurals.notification_offline_playlist_progress_track_count, i3, Integer.valueOf(i4), Integer.valueOf(i3));
                        z = true;
                        z2 = false;
                    }
                    String strC2 = typ.c(str2);
                    atrVarF = htpVar2.f(strH2);
                    atrVarF.l(strC2);
                    Context context = htpVar2.b;
                    atrVarF.j(context.getString(R.string.percent, Integer.valueOf(i5)));
                    atrVarF.k(quantityString);
                    atrVarF.q(R.drawable.yt_outline_download_white_24);
                    atrVarF.p(100, i5, false);
                    atrVarF.e(2, z);
                    atrVarF.e(16, z2);
                    atrVarF.h = qof.b(context, strH2.hashCode(), intentC2, 201326592);
                    if (z) {
                        atrVarF.G = htp.a;
                    }
                    htpVar2.i(strH2, htp.s(hcgVar2), 8, false, atrVarF);
                }
                quantityString = htpVar2.b.getString(R.string.offline_waiting_for_network);
                z2 = true;
                z = false;
                String strC3 = typ.c(str2);
                atrVarF = htpVar2.f(strH2);
                atrVarF.l(strC3);
                Context context2 = htpVar2.b;
                atrVarF.j(context2.getString(R.string.percent, Integer.valueOf(i5)));
                atrVarF.k(quantityString);
                atrVarF.q(R.drawable.yt_outline_download_white_24);
                atrVarF.p(100, i5, false);
                atrVarF.e(2, z);
                atrVarF.e(16, z2);
                atrVarF.h = qof.b(context2, strH2.hashCode(), intentC2, 201326592);
                if (z) {
                    atrVarF.G = htp.a;
                }
                htpVar2.i(strH2, htp.s(hcgVar2), 8, false, atrVarF);
            }
        }
    }
}
