package defpackage;

import android.content.Context;
import android.provider.MediaStore;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class isk implements jkt {
    private final Context a;

    public isk(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jkt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        String strValueOf = String.valueOf(obj.getLong(obj.getColumnIndex("_id")));
        String string = obj.getString(obj.getColumnIndex("artist"));
        if (string == null || TextUtils.equals(string, "<unknown>")) {
            string = this.a.getString(R.string.unknown_artist);
        }
        int i = obj.getInt(obj.getColumnIndex("number_of_tracks"));
        aihf aihfVarCreateBuilder = ankw.a.createBuilder();
        String strAp = kro.ap(20, "sideloaded", strValueOf);
        aihfVarCreateBuilder.copyOnWrite();
        ankw ankwVar = (ankw) aihfVarCreateBuilder.instance;
        strAp.getClass();
        ankwVar.b |= 1;
        ankwVar.c = strAp;
        aihfVarCreateBuilder.copyOnWrite();
        ankw ankwVar2 = (ankw) aihfVarCreateBuilder.instance;
        string.getClass();
        ankwVar2.b |= 4;
        ankwVar2.e = string;
        long j = i;
        aihfVarCreateBuilder.copyOnWrite();
        ankw ankwVar3 = (ankw) aihfVarCreateBuilder.instance;
        ankwVar3.b |= SemanticState.Focused;
        ankwVar3.j = j;
        String string2 = MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI.buildUpon().appendPath(strValueOf).build().toString();
        aihfVarCreateBuilder.copyOnWrite();
        ankw ankwVar4 = (ankw) aihfVarCreateBuilder.instance;
        string2.getClass();
        ankwVar4.b |= 64;
        ankwVar4.i = string2;
        aqmh aqmhVarN = aawb.N(ixt.r(this.a, R.drawable.cover_profile_empty_state));
        if (aqmhVarN != null) {
            aihfVarCreateBuilder.copyOnWrite();
            ankw ankwVar5 = (ankw) aihfVarCreateBuilder.instance;
            ankwVar5.f = aqmhVarN;
            ankwVar5.b |= 8;
        }
        return new ankp(((ankw) aihfVarCreateBuilder.build()).toBuilder()).an();
    }
}
