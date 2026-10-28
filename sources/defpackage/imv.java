package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imv extends imf {
    private final Context a;
    private final awmd b;
    private final dov c;

    public imv(Context context, dov dovVar, awmd awmdVar) {
        super(hcg.class, aouj.class);
        this.a = context;
        this.c = dovVar;
        this.b = awmdVar;
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [awmd, java.lang.Object] */
    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        boolean z;
        int iMax;
        hcg hcgVar = (hcg) obj;
        Optional optionalAl = hmy.al("display_context", imk.class, agkjVar);
        ahno.F(optionalAl.isPresent());
        agke agkeVar = hcgVar.c;
        int size = agkeVar.size();
        Optional optionalAl2 = hmy.al("playlist_panel_context", inh.class, agkjVar);
        if (optionalAl2.isPresent()) {
            iMax = Math.max(((inh) optionalAl2.get()).a, 0);
            z = size > 1 && ((inh) optionalAl2.get()).b;
        } else {
            z = false;
            iMax = 0;
        }
        aihh aihhVar = (aihh) aouj.a.createBuilder();
        if (((imk) optionalAl.get()).b != 1) {
            String str = hcgVar.f;
            aihhVar.copyOnWrite();
            aouj aoujVar = (aouj) aihhVar.instance;
            str.getClass();
            aoujVar.c |= SemanticState.Multiline;
            aoujVar.i = str;
        }
        String string = hcgVar.g;
        if (ahno.aa(string)) {
            string = this.a.getString(R.string.unknown_playlist);
        }
        alay alayVarC = ackj.c(string);
        aihhVar.copyOnWrite();
        aouj aoujVar2 = (aouj) aihhVar.instance;
        alayVarC.getClass();
        aoujVar2.f = alayVarC;
        aoujVar2.c |= 2;
        aihhVar.copyOnWrite();
        aouj aoujVar3 = (aouj) aihhVar.instance;
        aoujVar3.c |= 16384;
        aoujVar3.k = size;
        alay alayVarC2 = ackj.c(this.a.getResources().getQuantityString(R.plurals.offline_playlist_size, size, Integer.valueOf(size)));
        aihhVar.copyOnWrite();
        aouj aoujVar4 = (aouj) aihhVar.instance;
        alayVarC2.getClass();
        aoujVar4.l = alayVarC2;
        aoujVar4.c |= 32768;
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        if (z) {
            dov dovVar = this.c;
            if (size >= 0 && size > 0 && size != 0 && size > 0) {
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    int iNextInt = ((Random) dovVar.a.io()).nextInt(i2 + 1);
                    int i3 = iArr[i2];
                    iArr[i2] = iArr[iNextInt];
                    iArr[iNextInt] = i3;
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            anyx anyxVar = (anyx) agkeVar.get(iArr[i4]);
            vzq vzqVarA = ini.a();
            vzqVarA.e(i4);
            vzqVarA.f(iMax);
            vzqVarA.d(hcgVar.f);
            ini iniVarC = vzqVarA.c();
            agkh agkhVar = new agkh(4);
            agkhVar.i(agkjVar);
            agkhVar.e("playlist_panel_video_context", iniVarC);
            aoun aounVar = (aoun) ((hfn) this.b.io()).ap(anyx.class, aoun.class, anyxVar, agkhVar.d(true));
            aihf aihfVarCreateBuilder = aoui.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aoui aouiVar = (aoui) aihfVarCreateBuilder.instance;
            aounVar.getClass();
            aouiVar.c = aounVar;
            aouiVar.b |= 1;
            aihhVar.p((aoui) aihfVarCreateBuilder.build());
        }
        int iMax2 = Math.max(iMax, 0);
        aihhVar.copyOnWrite();
        aouj aoujVar5 = (aouj) aihhVar.instance;
        aoujVar5.c |= SemanticState.Modal;
        aoujVar5.h = iMax2;
        return (aouj) aihhVar.build();
    }
}
