package defpackage;

import android.content.Context;
import android.os.Build;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ism implements jkt {
    private final Context a;
    private final Map b;
    private final boolean c;

    public ism(Context context, Map map, boolean z) {
        this.a = context;
        this.b = map;
        this.c = z;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jkt
    public final /* synthetic */ Object a(Object obj) {
        String strValueOf = "";
        String string = strValueOf;
        String string2 = string;
        String string3 = string2;
        String strValueOf2 = string3;
        String strValueOf3 = strValueOf2;
        int i = 0;
        for (String str : obj.getColumnNames()) {
            switch (str.hashCode()) {
                case -1992012396:
                    if (!str.equals("duration")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    string3 = obj.getString(obj.getColumnIndex(str));
                    if (string3 == null) {
                        string3 = "0";
                    }
                    break;
                    break;
                case -1409097913:
                    if (!str.equals("artist")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    string2 = obj.getString(obj.getColumnIndex(str));
                    if (ahno.aa(string2)) {
                        string2 = this.a.getString(R.string.unknown_artist);
                    }
                    break;
                    break;
                case 94650:
                    if (!str.equals("_id")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    strValueOf3 = String.valueOf(obj.getLong(obj.getColumnIndex(str)));
                    break;
                    break;
                case 110371416:
                    if (!str.equals("title")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    string = obj.getString(obj.getColumnIndex(str));
                    if (ahno.aa(string)) {
                        string = this.a.getString(R.string.unknown_album_track_index);
                    }
                    break;
                    break;
                case 110621003:
                    if (!str.equals("track")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    i = obj.getInt(obj.getColumnIndex(str)) % 1000;
                    break;
                    break;
                case 975912484:
                    if (!str.equals("audio_id")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    strValueOf = String.valueOf(obj.getLong(obj.getColumnIndex(str)));
                    break;
                    break;
                case 1532078315:
                    if (!str.equals("album_id")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    strValueOf2 = String.valueOf(obj.getLong(obj.getColumnIndex(str)));
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
            }
        }
        aihf aihfVarCreateBuilder = anzd.a.createBuilder();
        String strAF = kro.aF(strValueOf);
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar = (anzd) aihfVarCreateBuilder.instance;
        strAF.getClass();
        anzdVar.b |= 1;
        anzdVar.c = strAF;
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar2 = (anzd) aihfVarCreateBuilder.instance;
        string.getClass();
        anzdVar2.b |= 4;
        anzdVar2.e = string;
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar3 = (anzd) aihfVarCreateBuilder.instance;
        string2.getClass();
        anzdVar3.b |= 32;
        anzdVar3.i = string2;
        long j = Long.parseLong(string3);
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar4 = (anzd) aihfVarCreateBuilder.instance;
        anzdVar4.b |= 131072;
        anzdVar4.u = j;
        String string4 = ixt.p(strValueOf).toString();
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar5 = (anzd) aihfVarCreateBuilder.instance;
        string4.getClass();
        anzdVar5.b |= 32768;
        anzdVar5.s = string4;
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar6 = (anzd) aihfVarCreateBuilder.instance;
        anzdVar6.b |= 65536;
        anzdVar6.t = i;
        String strAC = kro.aC(strValueOf2);
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar7 = (anzd) aihfVarCreateBuilder.instance;
        strAC.getClass();
        anzdVar7.b |= SemanticState.Multiline;
        anzdVar7.q = strAC;
        aqmh aqmhVarW = Build.VERSION.SDK_INT >= 29 ? ixt.w(this.a, ixt.l(strValueOf), R.drawable.empty_state_cover_square, this.c) : ixt.x(ahno.Z((String) this.b.get(strValueOf2)), this.a, R.drawable.empty_state_cover_square);
        if (aqmhVarW != null) {
            aihfVarCreateBuilder.copyOnWrite();
            anzd anzdVar8 = (anzd) aihfVarCreateBuilder.instance;
            anzdVar8.g = aqmhVarW;
            anzdVar8.b |= 16;
        }
        anyx anyxVarAm = anyx.e((anzd) aihfVarCreateBuilder.build()).am();
        if (strValueOf3 != null) {
            return new hci(anyxVarAm, strValueOf3);
        }
        throw new NullPointerException("Null memberId");
    }

    public ism(Context context, wek wekVar, boolean z) {
        this(context, agpn.b, z);
    }
}
