package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vxh {
    static {
        ajwo ajwoVar = ajwo.a;
    }

    public static ajwo a(String str) {
        ajmf ajmfVar;
        if (str == null) {
            ajmfVar = ajmf.a;
        } else {
            aihf aihfVarCreateBuilder = ajmf.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ajmf ajmfVar2 = (ajmf) aihfVarCreateBuilder.instance;
            ajmfVar2.b |= 1;
            ajmfVar2.c = str;
            ajmfVar = (ajmf) aihfVarCreateBuilder.build();
        }
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(ajmj.a, ajmfVar);
        return (ajwo) aihhVar.build();
    }

    public static ajwo b(String str) {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = ajmj.a;
        aihf aihfVarCreateBuilder = ajmf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajmf ajmfVar = (ajmf) aihfVarCreateBuilder.instance;
        str.getClass();
        ajmfVar.b |= 1;
        ajmfVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        ajmf ajmfVar2 = (ajmf) aihfVarCreateBuilder.instance;
        ajmfVar2.b |= 16;
        ajmfVar2.f = true;
        aihhVar.e(aihlVar, (ajmf) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    public static ajwo c(Uri uri) {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = araw.a;
        aihf aihfVarCreateBuilder = arav.a.createBuilder();
        String string = uri.toString();
        aihfVarCreateBuilder.copyOnWrite();
        arav aravVar = (arav) aihfVarCreateBuilder.instance;
        string.getClass();
        aravVar.b |= 1;
        aravVar.c = string;
        aihhVar.e(aihlVar, (arav) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }
}
