package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.RemoteAssetManager;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class qyz extends attd {
    public static final /* synthetic */ int a = 0;
    private static final rbm h = new rbm("qyz");

    public qyz(Context context) {
        atvx atvxVarA = atvy.a();
        File filesDir = context.getFilesDir();
        String path = "";
        if (filesDir == null) {
            rbc rbcVar = new rbc(h, rbd.e);
            rbcVar.c();
            rbcVar.a("Could not create cache dir: Context.getFilesDir() is null.", new Object[0]);
        } else {
            File file = new File(filesDir, "assets_cache");
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                path = file.getPath();
            } else {
                rbc rbcVar2 = new rbc(h, rbd.e);
                rbcVar2.c();
                rbcVar2.a("Could not create cache dir: %s", file);
            }
        }
        atvxVarA.c(path);
        atvxVarA.d(-1L);
        atvxVarA.a = new atuq();
        atvxVarA.b(agpi.a);
        super(RemoteAssetManager.a(context, atvxVarA.a()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, String str2, String str3, atte atteVar, attc attcVar) {
        String str4 = str + str2 + str3;
        agkj agkjVarJ = agkj.j(str4, atteVar);
        synchronized (this) {
            agqr it = ((agpk) ((agpn) agkjVarJ).entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str5 = (String) entry.getKey();
                atte atteVar2 = (atte) entry.getValue();
                Map map = this.b;
                if (!map.containsKey(str5) && !this.c.containsKey(str5)) {
                    map.put(str5, atteVar2);
                }
            }
        }
        agke agkeVarQ = agke.q(str4);
        qzd qzdVar = new qzd(attcVar, 1);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            agqs agqsVarListIterator = agkeVarQ.listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                String str6 = (String) agqsVarListIterator.next();
                atte atteVar3 = (atte) this.b.get(str6);
                atsp atspVar = (atsp) this.c.get(str6);
                atso atsoVar = (atso) this.d.get(str6);
                if (atteVar3 == null && atspVar == null && atsoVar == null) {
                    arrayList.add(str6);
                } else {
                    Effect effect = (Effect) this.e.get(str6);
                    if (effect != null) {
                        map2.put(str6, effect);
                    } else {
                        aglz aglzVar = this.f;
                        boolean zT = aglzVar.t(str6);
                        aglzVar.u(str6, qzdVar);
                        if (!zT) {
                            if (atteVar3 != null) {
                                Effect.f(atteVar3, this.g, new attb(this, str6, 0));
                            } else {
                                RemoteAssetManager remoteAssetManager = this.g;
                                if (atspVar != null) {
                                    attb attbVar = new attb(this, str6, 2);
                                    ahub ahubVar = Effect.d;
                                    String str7 = remoteAssetManager.c;
                                    if (str7 == null) {
                                        Effect.c(attbVar, null, "RemoteAssetManager sandbox failed to initialize", null);
                                    }
                                    remoteAssetManager.b(new atsw(attbVar, atspVar, str7, 0));
                                } else {
                                    Effect.d(atsoVar, remoteAssetManager, null, null, new attb(this, str6, 3));
                                }
                            }
                        }
                    }
                }
            }
        }
        adab adabVar = new adab((List) arrayList, (attc) qzdVar, (Map) map2, 19);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            adabVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(adabVar);
        }
    }
}
