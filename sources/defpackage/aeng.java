package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeng extends aenf {
    @Override // defpackage.aenf, defpackage.aduv
    public final int a(aliz alizVar) {
        if (alizVar == null) {
            return 0;
        }
        int iOrdinal = alizVar.ordinal();
        if (iOrdinal == 270) {
            return R.drawable.quantum_ic_person_add_grey600_18;
        }
        if (iOrdinal == 316) {
            return R.drawable.quantum_ic_done_white_24;
        }
        if (iOrdinal != 506) {
            return iOrdinal != 541 ? super.a(alizVar) : R.drawable.quantum_ic_link_white_24;
        }
        return R.drawable.quantum_ic_more_horiz_white_24;
    }
}
