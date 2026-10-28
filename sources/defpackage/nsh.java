package defpackage;

import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class nsh {
    public nsh() {
    }

    public static boolean a(atyn atynVar) {
        try {
            qra.a(atynVar);
            return true;
        } catch (IllegalArgumentException e) {
            onb.f(e, "Invalid transform specification");
            return false;
        }
    }

    public static void b(tdj tdjVar) {
        tdjVar.onResume(tdj.f);
    }

    public static void c(tdj tdjVar) {
        tdjVar.onPause(tdj.f);
    }

    public static askp d(Spanned spanned) {
        aihf aihfVarCreateBuilder = askp.a.createBuilder();
        String string = spanned.toString();
        aihfVarCreateBuilder.copyOnWrite();
        askp askpVar = (askp) aihfVarCreateBuilder.instance;
        string.getClass();
        askpVar.b |= 1;
        askpVar.c = string;
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj) - spanStart;
            if (obj instanceof StyleSpan) {
                aihf aihfVarCreateBuilder2 = asku.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                asku askuVar = (asku) aihfVarCreateBuilder2.instance;
                askuVar.b |= 1;
                askuVar.e = spanStart;
                aihfVarCreateBuilder2.copyOnWrite();
                asku askuVar2 = (asku) aihfVarCreateBuilder2.instance;
                askuVar2.b |= 2;
                askuVar2.f = spanEnd;
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    asku askuVar3 = (asku) aihfVarCreateBuilder2.instance;
                    askuVar3.d = 7;
                    askuVar3.c = 8;
                } else if (style == 2) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    asku askuVar4 = (asku) aihfVarCreateBuilder2.instance;
                    askuVar4.b |= SemanticState.LiveRegion;
                    askuVar4.k = true;
                } else if (style == 3) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    asku askuVar5 = (asku) aihfVarCreateBuilder2.instance;
                    askuVar5.d = 7;
                    askuVar5.c = 8;
                    aihfVarCreateBuilder2.copyOnWrite();
                    asku askuVar6 = (asku) aihfVarCreateBuilder2.instance;
                    askuVar6.b |= SemanticState.LiveRegion;
                    askuVar6.k = true;
                }
                aihfVarCreateBuilder.cB(aihfVarCreateBuilder2);
            } else if (obj instanceof URLSpan) {
                aihh aihhVar = (aihh) askq.a.createBuilder();
                aihhVar.copyOnWrite();
                askq askqVar = (askq) aihhVar.instance;
                askqVar.b |= 1;
                askqVar.c = spanStart;
                aihhVar.copyOnWrite();
                askq askqVar2 = (askq) aihhVar.instance;
                askqVar2.b |= 2;
                askqVar2.d = spanEnd;
                aihh aihhVar2 = (aihh) CommandOuterClass$Command.a.createBuilder();
                aihl aihlVar = asra.b;
                aihf aihfVarCreateBuilder3 = asra.a.createBuilder();
                String url = ((URLSpan) obj).getURL();
                aihfVarCreateBuilder3.copyOnWrite();
                asra asraVar = (asra) aihfVarCreateBuilder3.instance;
                url.getClass();
                asraVar.c |= 1;
                asraVar.d = url;
                aihhVar2.e(aihlVar, (asra) aihfVarCreateBuilder3.build());
                aihhVar.copyOnWrite();
                askq askqVar3 = (askq) aihhVar.instance;
                CommandOuterClass$Command commandOuterClass$Command = (CommandOuterClass$Command) aihhVar2.build();
                commandOuterClass$Command.getClass();
                askqVar3.e = commandOuterClass$Command;
                askqVar3.b |= 4;
                aihfVarCreateBuilder.copyOnWrite();
                askp askpVar2 = (askp) aihfVarCreateBuilder.instance;
                askq askqVar4 = (askq) aihhVar.build();
                askqVar4.getClass();
                askpVar2.a();
                askpVar2.g.add(askqVar4);
            } else if (obj instanceof UnderlineSpan) {
                aihf aihfVarCreateBuilder4 = asku.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                asku askuVar7 = (asku) aihfVarCreateBuilder4.instance;
                askuVar7.b |= 1;
                askuVar7.e = spanStart;
                aihfVarCreateBuilder4.copyOnWrite();
                asku askuVar8 = (asku) aihfVarCreateBuilder4.instance;
                askuVar8.b |= 2;
                askuVar8.f = spanEnd;
                aihfVarCreateBuilder4.copyOnWrite();
                asku askuVar9 = (asku) aihfVarCreateBuilder4.instance;
                askuVar9.j = 2;
                askuVar9.b |= SemanticState.Hidden;
                aihfVarCreateBuilder.cB(aihfVarCreateBuilder4);
            }
        }
        return (askp) aihfVarCreateBuilder.build();
    }

    public static void e(abte abteVar, aroq aroqVar, int i, int i2, String str, String str2) {
        aihf aihfVarCreateBuilder = aroo.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aroo arooVar = (aroo) aihfVarCreateBuilder.instance;
        arooVar.c = i2 - 1;
        arooVar.b |= 2;
        if (str != null && !str.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            aroo arooVar2 = (aroo) aihfVarCreateBuilder.instance;
            arooVar2.b |= 4;
            arooVar2.d = str;
        }
        if (str2 != null && !str2.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            aroo arooVar3 = (aroo) aihfVarCreateBuilder.instance;
            arooVar3.b |= 8;
            arooVar3.e = str2;
        }
        aihf aihfVarCreateBuilder2 = arop.a.createBuilder();
        aihf aihfVarCreateBuilder3 = aron.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        aron aronVar = (aron) aihfVarCreateBuilder3.instance;
        aroo arooVar4 = (aroo) aihfVarCreateBuilder.build();
        arooVar4.getClass();
        aronVar.c = arooVar4;
        aronVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        arop aropVar = (arop) aihfVarCreateBuilder2.instance;
        aron aronVar2 = (aron) aihfVarCreateBuilder3.build();
        aronVar2.getClass();
        aropVar.c = aronVar2;
        aropVar.b = 1;
        arop aropVar2 = (arop) aihfVarCreateBuilder2.build();
        aihf builder = aroqVar.toBuilder();
        builder.copyOnWrite();
        aroq aroqVar2 = (aroq) builder.instance;
        aropVar2.getClass();
        aroqVar2.c = aropVar2;
        aroqVar2.b |= 2;
        aihf aihfVarCreateBuilder4 = akzk.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        akzk akzkVar = (akzk) aihfVarCreateBuilder4.instance;
        aroq aroqVar3 = (aroq) builder.build();
        aroqVar3.getClass();
        akzkVar.n = aroqVar3;
        akzkVar.b |= 1073741824;
        akzk akzkVar2 = (akzk) aihfVarCreateBuilder4.build();
        xfh xfhVar = new xfh(i - 1, 47);
        xfhVar.a = akzkVar2;
        abteVar.b(xfhVar, alai.FLOW_TYPE_YPC_ACQUISITION);
    }

    public static void f(vxe vxeVar, ajwn ajwnVar) {
        if ((ajwnVar.b & 4) != 0) {
            ajwo ajwoVar = ajwnVar.e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
    }

    public static void g(vxe vxeVar, ajwn ajwnVar) {
        if ((ajwnVar.b & 1) != 0) {
            ajwo ajwoVar = ajwnVar.c;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
    }

    public static void h(vxe vxeVar, ajwn ajwnVar) {
        if ((ajwnVar.b & 8) != 0) {
            ajwo ajwoVar = ajwnVar.f;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
    }

    public static boolean i(int i) {
        return i == 1;
    }

    public nsh(byte[] bArr, byte[] bArr2) {
    }
}
