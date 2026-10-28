package defpackage;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npi {
    public static final /* synthetic */ int a = 0;
    private static final ExtensionRegistryLite b;
    private static final ExtensionRegistryLite c;

    static {
        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite();
        extensionRegistryLite.b(asri.b);
        b = extensionRegistryLite;
        ExtensionRegistryLite extensionRegistryLite2 = new ExtensionRegistryLite();
        extensionRegistryLite2.b(asmg.b);
        extensionRegistryLite2.b(asnf.b);
        c = extensionRegistryLite2;
    }

    public static fhu a(fhu fhuVar, String str, int i) {
        View viewD;
        if (i <= 1000 && fhuVar != null) {
            try {
                if (str.equals(fhuVar.l())) {
                    return fhuVar;
                }
                if (fhuVar.b() != null) {
                    viewD = fhuVar.b();
                } else {
                    viewD = fhuVar.d() != null ? fhuVar.d() : null;
                }
                if (viewD != null) {
                    fhu fhuVarL = l(viewD, str, i + 1);
                    if (fhuVarL != null) {
                        return fhuVarL;
                    }
                } else {
                    Iterator it = fhuVar.m().iterator();
                    while (it.hasNext()) {
                        fhu fhuVarA = a((fhu) it.next(), str, i + 1);
                        if (fhuVarA != null) {
                            return fhuVarA;
                        }
                    }
                }
            } catch (RuntimeException e) {
                e.getMessage();
            }
        }
        return null;
    }

    public static aijp b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        aihf aihfVarCreateBuilder = aijp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((aijp) aihfVarCreateBuilder.instance).b = jCurrentTimeMillis / 1000;
        aihfVarCreateBuilder.copyOnWrite();
        ((aijp) aihfVarCreateBuilder.instance).c = ((int) (jCurrentTimeMillis % 1000)) * 1000000;
        return (aijp) aihfVarCreateBuilder.build();
    }

    public static asrl c(nay nayVar, nwl nwlVar, byte[] bArr, String str, nso nsoVar) {
        try {
            ByteBuffer byteBufferB = nsoVar.b(nayVar);
            if (byteBufferB == null) {
                return null;
            }
            asmv asmvVar = (asmv) aihn.parseFrom(asmv.a, byteBufferB, ExtensionRegistryLite.getGeneratedRegistry());
            aihf aihfVarCreateBuilder = asrl.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            asrl asrlVar = (asrl) aihfVarCreateBuilder.instance;
            asmvVar.getClass();
            asrlVar.e = asmvVar;
            asrlVar.b |= 4;
            if (nwlVar != null) {
                asnx asnxVar = (asnx) aihn.parseFrom(asnx.a, nwlVar.c(), ExtensionRegistryLite.getGeneratedRegistry());
                aihfVarCreateBuilder.copyOnWrite();
                asrl asrlVar2 = (asrl) aihfVarCreateBuilder.instance;
                asnxVar.getClass();
                asrlVar2.d = asnxVar;
                asrlVar2.b |= 2;
            }
            if (bArr != null) {
                asop asopVar = (asop) aihn.parseFrom(asop.a, bArr, c);
                aihfVarCreateBuilder.copyOnWrite();
                asrl asrlVar3 = (asrl) aihfVarCreateBuilder.instance;
                asopVar.getClass();
                asrlVar3.f = asopVar;
                asrlVar3.b |= 8;
            }
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                asrl asrlVar4 = (asrl) aihfVarCreateBuilder.instance;
                asrlVar4.b |= 1;
                asrlVar4.c = str;
            }
            return (asrl) aihfVarCreateBuilder.build();
        } catch (IOException unused) {
            return null;
        }
    }

    public static assc d(DebuggerClient debuggerClient, nsl nslVar) {
        String str;
        aihf aihfVarCreateBuilder = assc.a.createBuilder();
        String string = Long.toString(debuggerClient.createEventId());
        aihfVarCreateBuilder.copyOnWrite();
        assc asscVar = (assc) aihfVarCreateBuilder.instance;
        string.getClass();
        asscVar.b |= 2;
        asscVar.d = string;
        String str2 = nslVar.u;
        if (str2 == null || (str = nslVar.v) == null) {
            return (assc) aihfVarCreateBuilder.build();
        }
        aihf aihfVarCreateBuilder2 = asrj.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        asrj asrjVar = (asrj) aihfVarCreateBuilder2.instance;
        asrjVar.b |= 2;
        asrjVar.d = str2;
        aihfVarCreateBuilder2.copyOnWrite();
        asrj asrjVar2 = (asrj) aihfVarCreateBuilder2.instance;
        asrjVar2.b |= 1;
        asrjVar2.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        assc asscVar2 = (assc) aihfVarCreateBuilder.instance;
        asrj asrjVar3 = (asrj) aihfVarCreateBuilder2.build();
        asrjVar3.getClass();
        asscVar2.c = asrjVar3;
        asscVar2.b |= 1;
        return (assc) aihfVarCreateBuilder.build();
    }

    public static String e(nds ndsVar) {
        String strF;
        try {
            if (ndsVar instanceof mvv) {
                agke agkeVarAF = ksy.aF(ndsVar, 224886694);
                asod asodVar = asod.a;
                strF = f((asod) qnl.bt(agkeVarAF, aihn.getParserForClass(asod.class), b));
            } else {
                strF = f((asod) aihn.parseFrom(asod.a, ndsVar.f(), b));
            }
            return strF;
        } catch (aiik unused) {
            return null;
        }
    }

    public static String f(asod asodVar) {
        aihl aihlVar = asri.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        asodVar.c(aihlVarCheckIsLite);
        if (asodVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            asodVar.c(aihlVarCheckIsLite2);
            Object objK = asodVar.j.k(aihlVarCheckIsLite2.d);
            asri asriVar = (asri) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if ((asriVar.c & 2) != 0) {
                return asriVar.d;
            }
        }
        return null;
    }

    public static String g(View view) {
        Object tag = view.getTag(R.id.elements_tree_debug_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static void h(fhu fhuVar, axo axoVar, int[] iArr) {
        if (fhuVar != null) {
            axoVar.accept(Pair.create(iArr, fhuVar));
            Iterator it = fhuVar.m().iterator();
            while (it.hasNext()) {
                h((fhu) it.next(), axoVar, iArr);
            }
        }
    }

    public static void i(View view, axo axoVar) {
        if (view != null) {
            if (view instanceof fjw) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                h(fhu.g((fjw) view), axoVar, iArr);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    i(viewGroup.getChildAt(i), axoVar);
                }
            }
        }
    }

    public static View j(View view, String str) {
        if (view instanceof fjw) {
            fjw fjwVar = (fjw) view;
            if (str.equals(g(view))) {
                return fjwVar;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View viewJ = j(viewGroup.getChildAt(i), str);
                if (viewJ != null) {
                    return viewJ;
                }
            }
        }
        return null;
    }

    public static void k(asri asriVar, aihh aihhVar) {
        asod asodVar = ((asmv) aihhVar.instance).d;
        if (asodVar == null) {
            asodVar = asod.a;
        }
        aihh aihhVar2 = (aihh) asodVar.toBuilder();
        aihhVar2.e(asri.b, asriVar);
        aihhVar.copyOnWrite();
        asmv asmvVar = (asmv) aihhVar.instance;
        asod asodVar2 = (asod) aihhVar2.build();
        asodVar2.getClass();
        asmvVar.d = asodVar2;
        asmvVar.b |= 2;
        for (int i = 0; i < ((asmv) aihhVar.instance).e.size(); i++) {
            aihf aihfVarCreateBuilder = asri.a.createBuilder();
            String str = asriVar.d + ':' + i;
            aihfVarCreateBuilder.copyOnWrite();
            asri asriVar2 = (asri) aihfVarCreateBuilder.instance;
            asriVar2.c |= 2;
            asriVar2.d = str;
            asri asriVar3 = (asri) aihfVarCreateBuilder.build();
            aihh aihhVar3 = (aihh) aihhVar.t(i).toBuilder();
            k(asriVar3, aihhVar3);
            aihhVar.copyOnWrite();
            asmv asmvVar2 = (asmv) aihhVar.instance;
            asmv asmvVar3 = (asmv) aihhVar3.build();
            asmvVar3.getClass();
            asmvVar2.d();
            asmvVar2.e.set(i, asmvVar3);
        }
    }

    private static fhu l(View view, String str, int i) {
        fhu fhuVarA = null;
        if (i <= 1000 && view != null) {
            try {
                if (view instanceof fjw) {
                    fhuVarA = a(fhu.g((fjw) view), str, i + 1);
                } else if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        fhu fhuVarL = l(viewGroup.getChildAt(i2), str, i + 1);
                        if (fhuVarL != null) {
                            fhuVarA = fhuVarL;
                            break;
                        }
                    }
                }
            } catch (RuntimeException e) {
                e.getMessage();
            }
        }
        return fhuVarA;
    }
}
