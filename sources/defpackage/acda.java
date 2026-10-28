package defpackage;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import com.google.android.apps.youtube.music.player.PlayerPanel;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acda {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;
    public final Object e;

    public acda(Context context, abww abwwVar, vxz vxzVar) {
        abwwVar.getClass();
        context.getClass();
        this.a = context;
        this.b = new HashSet();
        this.e = vxzVar;
    }

    private final CaptioningManager h() {
        if (this.c == null) {
            this.c = (CaptioningManager) ((Context) this.a).getSystemService("captioning");
        }
        return (CaptioningManager) this.c;
    }

    public final float a() {
        return h().getFontScale();
    }

    public final accp b() {
        return new accp(h().getUserStyle(), (vxz) this.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void c(float f) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((accz) it.next()).b(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void d(accp accpVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((accz) it.next()).jN(accpVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void e(accz acczVar) {
        ?? r0 = this.b;
        if (r0.isEmpty()) {
            this.d = new accy(this);
            h().addCaptioningChangeListener((CaptioningManager.CaptioningChangeListener) this.d);
        }
        r0.add(acczVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void f(accz acczVar) {
        ?? r0 = this.b;
        r0.remove(acczVar);
        if (r0.isEmpty()) {
            h().removeCaptioningChangeListener((CaptioningManager.CaptioningChangeListener) this.d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (((defpackage.vxz) r5.b.io()).l(95, 45762151, false) == false) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [aunn, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.d
            if (r0 == 0) goto L34
            java.lang.Object r0 = r5.c
            hww r0 = (defpackage.hww) r0
            int r0 = r0.ordinal()
            r1 = 0
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L2a;
                case 2: goto L34;
                case 3: goto L34;
                case 4: goto L2a;
                case 5: goto L2a;
                case 6: goto L34;
                case 7: goto L34;
                case 8: goto L2a;
                case 9: goto L17;
                case 10: goto L2a;
                case 11: goto L2a;
                default: goto L10;
            }
        L10:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r0 = 0
            r5.<init>(r0, r0)
            throw r5
        L17:
            java.lang.Object r0 = r5.b
            java.lang.Object r0 = r0.io()
            vxz r0 = (defpackage.vxz) r0
            r2 = 95
            r3 = 45762151(0x2ba4667, double:2.26095067E-316)
            boolean r0 = r0.l(r2, r3, r1)
            if (r0 != 0) goto L34
        L2a:
            java.lang.Object r5 = r5.a
            com.google.android.apps.youtube.music.player.PlayerPanel r5 = (com.google.android.apps.youtube.music.player.PlayerPanel) r5
            android.view.View r5 = r5.a
            r5.setVisibility(r1)
            goto L3b
        L34:
            java.lang.Object r5 = r5.a
            com.google.android.apps.youtube.music.player.PlayerPanel r5 = (com.google.android.apps.youtube.music.player.PlayerPanel) r5
            r5.a()
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acda.g():void");
    }

    public acda(ght ghtVar, gjw gjwVar, ghj ghjVar) {
        this.e = ghtVar;
        this.b = gjwVar;
        this.a = ghjVar;
    }

    public acda(ght ghtVar, gkg gkgVar, gju gjuVar) {
        this.a = ghtVar;
        this.b = gkgVar;
        this.e = gjuVar;
    }

    public acda(PlayerPanel playerPanel, aunn aunnVar) {
        this.c = hww.a;
        this.e = new jnd(this);
        this.b = aunnVar;
        this.a = playerPanel;
    }
}
