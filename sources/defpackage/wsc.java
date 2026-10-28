package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wsc extends wlu {
    public final List a;
    public String b;
    public aigj c;
    private boolean d;

    protected wsc(abxv abxvVar, zwa zwaVar) {
        super("playlist/get_add_to_playlist", abxvVar, zwaVar, 1, true, null, null);
        this.a = new ArrayList();
        this.d = false;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alwl.a.createBuilder();
        List list = this.a;
        if (!list.isEmpty() && TextUtils.isEmpty(this.b)) {
            aihfVarCreateBuilder.copyOnWrite();
            alwl alwlVar = (alwl) aihfVarCreateBuilder.instance;
            aiie aiieVar = alwlVar.d;
            if (!aiieVar.c()) {
                alwlVar.d = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list, alwlVar.d);
        } else if (!TextUtils.isEmpty(this.b) && list.isEmpty()) {
            String str = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            alwl alwlVar2 = (alwl) aihfVarCreateBuilder.instance;
            str.getClass();
            alwlVar2.b |= 2;
            alwlVar2.e = str;
        }
        aigj aigjVar = this.c;
        if (aigjVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alwl alwlVar3 = (alwl) aihfVarCreateBuilder.instance;
            alwlVar3.b |= 8;
            alwlVar3.g = aigjVar;
        }
        boolean z = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        alwl alwlVar4 = (alwl) aihfVarCreateBuilder.instance;
        alwlVar4.b |= 4;
        alwlVar4.f = z;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.P(this.a.isEmpty() ^ TextUtils.isEmpty(this.b), "GetAddToPlaylistServiceRequest must have videoIds XOR playlistId");
    }

    public final void e() {
        this.d = true;
    }
}
