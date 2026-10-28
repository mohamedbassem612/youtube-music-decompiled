package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iad implements aaqk {
    public final Context a;
    public final hpd b;
    public final kyr c;
    private final hpk d;
    private final hpy e;
    private final Executor f;
    private iac g;
    private final hbf h;

    public iad(Context context, hpk hpkVar, hpd hpdVar, hpy hpyVar, kyr kyrVar, Executor executor, hbf hbfVar) {
        this.a = context;
        this.d = hpkVar;
        this.b = hpdVar;
        this.e = hpyVar;
        this.c = kyrVar;
        this.f = executor;
        this.h = hbfVar;
    }

    public static agke c(List list) {
        return (agke) Collection.EL.stream(list).map(new iaa(3)).collect(aghu.a);
    }

    private final iac d(abnl abnlVar) {
        ListenableFuture listenableFutureF;
        String strU = abnlVar.u();
        if (TextUtils.isEmpty(strU) || TextUtils.equals("PPSV", strU)) {
            listenableFutureF = f(abnlVar, new iaa(4), "PPSV", this.a.getString(R.string.offline_songs_title));
        } else if (TextUtils.equals("PPSE", strU)) {
            listenableFutureF = f(abnlVar, new iaa(0), "PPSE", this.h.b());
        } else if (TextUtils.equals("PPSDST", strU)) {
            listenableFutureF = f(abnlVar, new iaa(2), "PPSDST", this.a.getString(R.string.recent_music_playlist_title));
        } else if (TextUtils.equals("PPAD", strU)) {
            hpk hpkVar = this.d;
            hpt hptVar = new hpt();
            hptVar.b(false);
            hptVar.c(true);
            hptVar.f(true);
            hptVar.d(true);
            hptVar.g(true);
            hptVar.e(false);
            afxd afxdVarF = afxd.f(hpkVar.e(hptVar.a()));
            String strW = abnlVar.w();
            ajwo ajwoVar = abnlVar.b;
            Optional optionalJ = ajwoVar != null ? hna.j(ajwoVar) : Optional.empty();
            if (true == optionalJ.isPresent()) {
                aofy aofyVarA = aofy.a(((aohs) optionalJ.get()).h);
                if (aofyVarA == null) {
                    aofyVarA = aofy.OFFLINE_PLAYLIST_SORT_ORDER_UNSPECIFIED;
                }
                optionalJ = Optional.ofNullable(aofyVarA);
            }
            aofy aofyVar = (aofy) optionalJ.orElse(aofy.OFFLINE_PLAYLIST_SORT_ORDER_UNSPECIFIED);
            hqj hqjVar = new hqj(this, 13);
            Executor executor = this.f;
            listenableFutureF = afxdVarF.h(hqjVar, executor).g(new hco(this, strW, aofyVar, 3, (char[]) null), executor);
        } else {
            String strU2 = abnlVar.u();
            afxd afxdVarF2 = afxd.f(hpb.k(this.e, strU2, false));
            hqt hqtVar = new hqt(17);
            Executor executor2 = this.f;
            afxd afxdVarG = afxdVarF2.g(hqtVar, executor2).h(new hqj(this.b, 12), executor2).g(new gqa(this, abnlVar, 16), executor2);
            listenableFutureF = ahno.av(afxdVarF2, afxdVarG).k(new egz(afxdVarG, strU2, afxdVarF2, 16, (char[]) null), executor2);
        }
        try {
            return (iac) listenableFutureF.get(60L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return iac.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:4:0x0003, B:8:0x0009, B:10:0x0011, B:12:0x001c, B:13:0x002c, B:15:0x003a, B:16:0x004e, B:19:0x0052, B:20:0x0057), top: B:25:0x0001 }] */
    private final synchronized iac e(abnl abnlVar) {
        iac iacVarD;
        try {
            if (abnlVar == null) {
                throw new IllegalArgumentException();
            }
            iacVarD = this.g;
            if (iacVarD == null) {
                iacVarD = d(abnlVar);
                ajwo ajwoVar = abnlVar.b;
                if (ajwoVar != null) {
                    Optional optionalJ = hna.j(ajwoVar);
                    if (true == optionalJ.isPresent()) {
                        optionalJ = Optional.ofNullable(Boolean.valueOf(((aohs) optionalJ.get()).c));
                    }
                    if (((Boolean) optionalJ.orElse(Boolean.FALSE)).booleanValue()) {
                        ArrayList arrayList = new ArrayList(iacVarD.c);
                        Collections.shuffle(arrayList);
                        iac iacVarA = iac.a(iacVarD.b, arrayList);
                        this.g = iacVarA;
                        iacVarD = iacVarA;
                    } else {
                        this.g = iacVarD;
                    }
                } else {
                    this.g = iacVarD;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return iacVarD;
    }

    private final ListenableFuture f(abnl abnlVar, final Function function, String str, String str2) {
        afxd afxdVarF = afxd.f(this.e.a(kro.aq()));
        ahcy ahcyVar = new ahcy() { // from class: hzz
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return ahng.n(agpi.a);
                }
                Function function2 = function;
                iad iadVar = this.a;
                return iadVar.b.h((List) Collection.EL.stream((List) function2.apply((annv) optional.get())).map(new iaa(3)).collect(aghu.a));
            }
        };
        Executor executor = this.f;
        return ahno.ar(afxdVarF.h(ahcyVar, executor), new hro(this, abnlVar.w(), str, str2, 3), executor);
    }

    @Override // defpackage.aaqk
    public final aamh a(abnl abnlVar) {
        return e(abnlVar).b;
    }

    @Override // defpackage.aaqk
    public final /* synthetic */ List b(abnl abnlVar) {
        return e(abnlVar).c;
    }
}
