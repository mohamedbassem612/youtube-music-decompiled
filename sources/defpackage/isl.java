package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class isl implements jkt {
    private final Context a;
    private final wek b;

    public isl(Context context, wek wekVar) {
        this.a = context;
        this.b = wekVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jkt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        String strValueOf = String.valueOf(obj.getLong(obj.getColumnIndex("_id")));
        String string = obj.getString(obj.getColumnIndex("name"));
        aihh aihhVar = (aihh) anuu.a.createBuilder();
        String strAD = kro.aD(strValueOf);
        aihhVar.copyOnWrite();
        anuu anuuVar = (anuu) aihhVar.instance;
        strAD.getClass();
        anuuVar.b |= 1;
        anuuVar.c = strAD;
        if (ahno.aa(string)) {
            string = this.a.getString(R.string.unknown_playlist);
        }
        aihhVar.copyOnWrite();
        anuu anuuVar2 = (anuu) aihhVar.instance;
        string.getClass();
        anuuVar2.b |= 2;
        anuuVar2.d = string;
        aqmh aqmhVarN = aawb.N(ixt.r(this.a, R.drawable.playlist_empty_state));
        if (aqmhVarN != null) {
            aihhVar.copyOnWrite();
            anuu anuuVar3 = (anuu) aihhVar.instance;
            anuuVar3.h = aqmhVarN;
            anuuVar3.b |= 32;
        }
        String strAE = kro.aE(strValueOf);
        aihhVar.copyOnWrite();
        anuu anuuVar4 = (anuu) aihhVar.instance;
        strAE.getClass();
        anuuVar4.b |= SemanticState.Multiline;
        anuuVar4.r = strAE;
        String string2 = ixt.n(strValueOf).toString();
        aihhVar.copyOnWrite();
        anuu anuuVar5 = (anuu) aihhVar.instance;
        string2.getClass();
        anuuVar5.b |= 131072;
        anuuVar5.v = string2;
        return anuk.e((anuu) aihhVar.build()).aq();
    }
}
