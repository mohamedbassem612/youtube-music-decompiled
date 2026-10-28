package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class isj implements jkt {
    private final Context a;
    private final boolean b;

    public isj(Context context, boolean z) {
        this.a = context;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jkt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        String strValueOf = String.valueOf(obj.getLong(obj.getColumnIndex("_id")));
        String string = obj.getString(obj.getColumnIndex("album"));
        if (string == null || TextUtils.equals(string, "<unknown>")) {
            string = this.a.getString(R.string.unknown_album);
        }
        String string2 = obj.getString(obj.getColumnIndex("artist"));
        if (string2 == null || TextUtils.equals(string2, "<unknown>")) {
            string2 = this.a.getString(R.string.unknown_artist);
        }
        int i = obj.getInt(obj.getColumnIndex("numsongs"));
        int i2 = obj.getInt(obj.getColumnIndex("maxyear"));
        String string3 = obj.getString(obj.getColumnIndex("album_art"));
        aihh aihhVar = (aihh) ankd.a.createBuilder();
        String strAC = kro.aC(strValueOf);
        aihhVar.copyOnWrite();
        ankd ankdVar = (ankd) aihhVar.instance;
        strAC.getClass();
        ankdVar.b |= 1;
        ankdVar.c = strAC;
        aihhVar.copyOnWrite();
        ankd ankdVar2 = (ankd) aihhVar.instance;
        string.getClass();
        ankdVar2.b |= 4;
        ankdVar2.e = string;
        aihhVar.copyOnWrite();
        ankd ankdVar3 = (ankd) aihhVar.instance;
        ankdVar3.b |= SemanticState.LiveRegion;
        ankdVar3.n = i;
        aihhVar.copyOnWrite();
        ankd ankdVar4 = (ankd) aihhVar.instance;
        string2.getClass();
        ankdVar4.b |= 32;
        ankdVar4.i = string2;
        String string4 = ixt.m(strValueOf).toString();
        aihhVar.copyOnWrite();
        ankd ankdVar5 = (ankd) aihhVar.instance;
        string4.getClass();
        ankdVar5.b |= 131072;
        ankdVar5.w = string4;
        aqmh aqmhVarW = Build.VERSION.SDK_INT >= 29 ? ixt.w(this.a, new Uri.Builder().scheme("content").authority("media").appendPath("external").appendPath("audio").appendPath("albumart").appendPath(strValueOf).build(), R.drawable.empty_state_cover_square, this.b) : ixt.x(ahno.Z(string3), this.a, R.drawable.empty_state_cover_square);
        if (aqmhVarW != null) {
            aihhVar.copyOnWrite();
            ankd ankdVar6 = (ankd) aihhVar.instance;
            ankdVar6.g = aqmhVarW;
            ankdVar6.b |= 16;
        }
        if (i2 > 0) {
            aihf aihfVarCreateBuilder = akke.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            akke akkeVar = (akke) aihfVarCreateBuilder.instance;
            akkeVar.b |= 1;
            akkeVar.c = i2;
            akke akkeVar2 = (akke) aihfVarCreateBuilder.build();
            aihhVar.copyOnWrite();
            ankd ankdVar7 = (ankd) aihhVar.instance;
            akkeVar2.getClass();
            ankdVar7.q = akkeVar2;
            ankdVar7.b |= SemanticState.Modal;
        }
        return new anjv((aihh) ((ankd) aihhVar.build()).toBuilder()).am();
    }
}
