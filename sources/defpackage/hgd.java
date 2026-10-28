package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.net.Uri;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgd implements SharedPreferences.OnSharedPreferenceChangeListener, acdp, tbj, xzf {
    public final awmd a;
    public final awmd b;
    public final awmd c;
    public final awmd d;
    public final avlh e;
    public final jkp f;
    public final avmb g;
    public final vxz i;
    private final Context j;
    private final avlh k;
    private boolean m;
    private final jnj n;
    public final avmm h = new avmm();
    private int l = 0;

    public hgd(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, Context context, avlh avlhVar, avlh avlhVar2, jkp jkpVar, jnj jnjVar, vxz vxzVar, avmb avmbVar) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.j = context;
        this.e = avlhVar;
        this.k = avlhVar2;
        this.f = jkpVar;
        this.n = jnjVar;
        this.i = vxzVar;
        this.g = avmbVar;
    }

    private final int l() {
        long jC = this.i.c(1, 45778239L, 25L);
        if (jC > 0) {
            return (int) jC;
        }
        return 25;
    }

    public final void a() {
        agrx agrxVar = agso.a;
        this.k.L(this.g).H(new hbz(2)).p().al(new gem(this, 10), new gfh(6));
    }

    @Override // defpackage.tbj
    public final void d(int i, int i2) {
        agrx agrxVar = agso.a;
        j();
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        agrx agrxVar = agso.a;
        j();
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        if ((i & 1280) != 0) {
            agrx agrxVar = agso.a;
            j();
        }
    }

    @Override // defpackage.xzf
    public final void h(xzc xzcVar) {
        agrx agrxVar = agso.a;
        j();
    }

    public final void i() {
        this.m = this.f.getBoolean(gzj.AUTOPLAY_ENABLED, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j() {
        List<hyz> listSubList;
        char c;
        agke agkeVarN;
        agke<MediaSessionCompat$QueueItem> agkeVar;
        char c2;
        String str;
        String str2;
        CharSequence charSequence;
        Bitmap bitmap;
        Uri uri;
        fg fgVar = ((aceo) this.c.io()).a;
        if (fgVar != null) {
            vxz vxzVar = this.i;
            char c3 = 0;
            if (!vxzVar.l(8, 45687082L, false) || this.m) {
                abjp abjpVar = (abjp) this.b.io();
                int iL = l();
                if (iL <= 0) {
                    listSubList = agpi.a;
                } else {
                    abjr abjrVar = abjpVar.b;
                    int size = abjrVar.size();
                    if (size <= iL) {
                        listSubList = abjpVar.n();
                    } else {
                        int iMax = Math.max(0, abjpVar.c());
                        listSubList = abjrVar.subList(iMax, Math.min(iL + iMax, size));
                    }
                }
            } else {
                awmd awmdVar = this.b;
                List listO = ((abjp) awmdVar.io()).o(0);
                int iMax2 = Math.max(0, ((abjp) awmdVar.io()).a());
                listSubList = listO.subList(iMax2, Math.min(l() + iMax2, listO.size()));
            }
            if (listSubList == null || listSubList.isEmpty()) {
                c = 0;
                agrx agrxVar = agso.a;
                agkeVarN = agpi.a;
            } else {
                ArrayList arrayList = new ArrayList(listSubList.size());
                for (hyz hyzVar : listSubList) {
                    if (hyzVar != null) {
                        if (hyzVar instanceof hyw) {
                            hyw hywVar = (hyw) hyzVar;
                            String strH = hywVar.h();
                            String strG = hywVar.g();
                            Uri uriH = hywVar.e() != null ? aawb.H(hywVar.e()) : null;
                            hyz hyzVar2 = (hyz) ((abjp) this.b.io()).k(this.n.q());
                            if (hyzVar2 == null || hyzVar2.m() != hyzVar.m()) {
                                c2 = c3;
                                str = strH;
                                str2 = strG;
                                uri = uriH;
                                charSequence = null;
                                bitmap = null;
                            } else {
                                awmd awmdVar2 = this.a;
                                CharSequence charSequenceS = ((acdq) awmdVar2.io()).s().length() > 0 ? ((acdq) awmdVar2.io()).s() : ((acdq) awmdVar2.io()).t();
                                Bitmap bitmapP = ((acdq) awmdVar2.io()).p();
                                String strH2 = hywVar.h();
                                String strG2 = hywVar.g();
                                c2 = c3;
                                Object[] objArr = new Object[3];
                                objArr[c2] = strH2;
                                objArr[1] = strG2;
                                objArr[2] = charSequenceS;
                                int iHash = Objects.hash(objArr);
                                if (iHash != this.l) {
                                    this.l = iHash;
                                    Locale locale = Locale.getDefault();
                                    String strH3 = hywVar.h();
                                    String strG3 = hywVar.g();
                                    Object[] objArr2 = new Object[3];
                                    objArr2[c2] = strH3;
                                    objArr2[1] = strG3;
                                    objArr2[2] = charSequenceS;
                                    String.format(locale, "BT metadata: Set playing queue item: %s, %s, %s", objArr2);
                                }
                                str = strH;
                                str2 = strG;
                                uri = uriH;
                                bitmap = bitmapP;
                                charSequence = charSequenceS;
                            }
                        } else {
                            c2 = c3;
                            str = null;
                            str2 = null;
                            charSequence = null;
                            bitmap = null;
                            uri = null;
                        }
                        arrayList.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(null, str, str2, charSequence, bitmap, uri, null, null), hyzVar.m()));
                        c3 = c2;
                    }
                }
                c = c3;
                agkeVarN = agke.n(arrayList);
            }
            agke<MediaSessionCompat$QueueItem> agkeVar2 = agkeVarN;
            if (agkeVar2 != null) {
                HashSet hashSet = new HashSet();
                for (MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem : agkeVar2) {
                    if (mediaSessionCompat$QueueItem == null) {
                        throw new IllegalArgumentException("queue shouldn't have null items");
                    }
                    long j = mediaSessionCompat$QueueItem.b;
                    Long lValueOf = Long.valueOf(j);
                    if (hashSet.contains(lValueOf)) {
                        Log.e("MediaSessionCompat", a.bS(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                    }
                    hashSet.add(lValueOf);
                }
                agkeVar = agkeVar2;
            } else {
                agkeVar = null;
            }
            fb fbVar = (fb) fgVar.c;
            fbVar.f = agkeVar;
            if (agkeVar == null) {
                fbVar.a.setQueue(null);
            } else {
                ArrayList arrayList2 = new ArrayList(agkeVar.size());
                for (MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem2 : agkeVar) {
                    MediaSession.QueueItem queueItem = mediaSessionCompat$QueueItem2.c;
                    if (queueItem == null) {
                        mediaSessionCompat$QueueItem2.c = new MediaSession.QueueItem((MediaDescription) mediaSessionCompat$QueueItem2.a.b(), mediaSessionCompat$QueueItem2.b);
                        queueItem = mediaSessionCompat$QueueItem2.c;
                    }
                    arrayList2.add(queueItem);
                }
                fbVar.a.setQueue(arrayList2);
            }
            if (agkeVar2 != null) {
                fbVar.a.setQueueTitle(this.j.getString(R.string.default_queue_title));
                if (vxzVar.l(14, 45716162L, c)) {
                    fgVar.i(4);
                    return;
                }
                return;
            }
            boolean z = c;
            if (vxzVar.l(14, 45716162L, z)) {
                fgVar.i(z ? 1 : 0);
            }
        }
    }

    @Override // defpackage.tbj
    public final void jT(int i, int i2) {
        agrx agrxVar = agso.a;
        j();
    }

    @Override // defpackage.tbj
    public final void jU(int i, int i2) {
        agrx agrxVar = agso.a;
        j();
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        agrx agrxVar = agso.a;
        j();
    }

    @Override // defpackage.tbj
    public final void k(int i, int i2) {
        agrx agrxVar = agso.a;
        j();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (TextUtils.equals(str, this.f.b(gzj.AUTOPLAY_ENABLED))) {
            i();
            j();
        }
    }
}
