package defpackage;

import app.rive.core.FrameTicker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adrq implements FrameTicker {
    public Long a;
    private final FrameTicker b;

    public adrq(FrameTicker frameTicker) {
        this.b = frameTicker;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0055 -> B:18:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.rive.core.FrameTicker
    public final java.lang.Object withFrame(defpackage.awqg r11, defpackage.awoq r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.adrp
            if (r0 == 0) goto L13
            r0 = r12
            adrp r0 = (defpackage.adrp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            adrp r0 = new adrp
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            awox r1 = defpackage.awox.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            awri r11 = r0.e
            java.lang.Object r2 = r0.a
            defpackage.atqp.j(r12)
            r5 = r10
            r7 = r2
            goto L56
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.atqp.j(r12)
            r7 = r11
        L39:
            awri r6 = new awri
            r6.<init>()
            hgo r4 = new hgo
            r8 = 16
            r9 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.a = r7
            r0.e = r6
            r0.d = r3
            app.rive.core.FrameTicker r10 = r5.b
            java.lang.Object r10 = r10.withFrame(r4, r0)
            if (r10 == r1) goto L5e
            r11 = r6
        L56:
            boolean r10 = r11.a
            if (r10 != 0) goto L5c
            r10 = r5
            goto L39
        L5c:
            awmy r1 = defpackage.awmy.a
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adrq.withFrame(awqg, awoq):java.lang.Object");
    }
}
