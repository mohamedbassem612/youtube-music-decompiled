package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.streaming.BufferedRangeOuterClass$BufferedRange;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.QoeErrorDetail;
import com.google.android.libraries.youtube.proto.PartialSegmentOuterClass$PartialSegment;
import defpackage.ahno;
import defpackage.aihf;
import defpackage.axo;
import defpackage.zhz;
import defpackage.zic;
import defpackage.zjr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class Utils {

    /* JADX INFO: compiled from: PG */
    public class QoeErrorBuilder {
        private final String a;
        private final ArrayList b = new ArrayList();

        public QoeErrorBuilder(String str) {
            this.a = str;
        }

        public final void a(axo axoVar) {
            axoVar.accept(zhz.d(new QoeError(this.a, this.b), false));
        }

        public final void b(String str, Object obj) {
            this.b.add(new QoeErrorDetail(str, obj.toString()));
        }
    }

    private Utils() {
    }

    public static void a(List list, List list2, List list3, zjr zjrVar) {
        aihf aihfVarCreateBuilder = null;
        aihf builder = null;
        for (int i = 0; i < list.size(); i++) {
            BufferedMediaSegment bufferedMediaSegment = (BufferedMediaSegment) list.get(i);
            if (i != 0) {
                ahno.F(((BufferedMediaSegment) list.get(i + (-1))).b + 1 == bufferedMediaSegment.b);
            }
            if (bufferedMediaSegment.j) {
                if (aihfVarCreateBuilder != null) {
                    FormatIdOuterClass$FormatId defaultInstance = ((BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance).c;
                    if (defaultInstance == null) {
                        defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
                    }
                    if (zic.g(defaultInstance, bufferedMediaSegment.a) && ((TimeRangeOuterClass$TimeRange) builder.instance).e == bufferedMediaSegment.f().e) {
                        long j = bufferedMediaSegment.b;
                        aihfVarCreateBuilder.copyOnWrite();
                        BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                        bufferedRangeOuterClass$BufferedRange.b |= 16;
                        bufferedRangeOuterClass$BufferedRange.e = j;
                        if (zjrVar.ea()) {
                            long jA = ((BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance).h + ((long) bufferedMediaSegment.a());
                            aihfVarCreateBuilder.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange2 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                            bufferedRangeOuterClass$BufferedRange2.b |= SemanticState.Obscured;
                            bufferedRangeOuterClass$BufferedRange2.h = jA;
                        }
                        long j2 = ((TimeRangeOuterClass$TimeRange) builder.instance).d + bufferedMediaSegment.f().d;
                        builder.copyOnWrite();
                        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange = (TimeRangeOuterClass$TimeRange) builder.instance;
                        timeRangeOuterClass$TimeRange.b |= 2;
                        timeRangeOuterClass$TimeRange.d = j2;
                    }
                } else {
                    aihfVarCreateBuilder = null;
                }
                if (aihfVarCreateBuilder != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange3 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                    TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange2 = (TimeRangeOuterClass$TimeRange) builder.build();
                    BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange4 = BufferedRangeOuterClass$BufferedRange.a;
                    timeRangeOuterClass$TimeRange2.getClass();
                    bufferedRangeOuterClass$BufferedRange3.f = timeRangeOuterClass$TimeRange2;
                    bufferedRangeOuterClass$BufferedRange3.b |= 32;
                    list2.add((BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.build());
                }
                aihfVarCreateBuilder = BufferedRangeOuterClass$BufferedRange.a.createBuilder();
                builder = bufferedMediaSegment.f().toBuilder();
                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = bufferedMediaSegment.a;
                aihfVarCreateBuilder.copyOnWrite();
                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange5 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                formatIdOuterClass$FormatId.getClass();
                bufferedRangeOuterClass$BufferedRange5.c = formatIdOuterClass$FormatId;
                bufferedRangeOuterClass$BufferedRange5.b |= 1;
                long j3 = bufferedMediaSegment.b;
                aihfVarCreateBuilder.copyOnWrite();
                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange6 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                bufferedRangeOuterClass$BufferedRange6.b |= 8;
                bufferedRangeOuterClass$BufferedRange6.d = j3;
                aihfVarCreateBuilder.copyOnWrite();
                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange7 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                bufferedRangeOuterClass$BufferedRange7.b |= 16;
                bufferedRangeOuterClass$BufferedRange7.e = j3;
                if (zjrVar.ea()) {
                    long jA2 = bufferedMediaSegment.a();
                    aihfVarCreateBuilder.copyOnWrite();
                    BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange8 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                    bufferedRangeOuterClass$BufferedRange8.b |= SemanticState.Obscured;
                    bufferedRangeOuterClass$BufferedRange8.h = jA2;
                }
                long j4 = bufferedMediaSegment.f().c;
                builder.copyOnWrite();
                TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange3 = (TimeRangeOuterClass$TimeRange) builder.instance;
                timeRangeOuterClass$TimeRange3.b |= 1;
                timeRangeOuterClass$TimeRange3.c = j4;
                long j5 = bufferedMediaSegment.f().d;
                builder.copyOnWrite();
                TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange4 = (TimeRangeOuterClass$TimeRange) builder.instance;
                timeRangeOuterClass$TimeRange4.b |= 2;
                timeRangeOuterClass$TimeRange4.d = j5;
                int i2 = bufferedMediaSegment.f().e;
                builder.copyOnWrite();
                TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange5 = (TimeRangeOuterClass$TimeRange) builder.instance;
                timeRangeOuterClass$TimeRange5.b |= 4;
                timeRangeOuterClass$TimeRange5.e = i2;
            } else {
                aihf aihfVarCreateBuilder2 = PartialSegmentOuterClass$PartialSegment.a.createBuilder();
                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId2 = bufferedMediaSegment.a;
                aihfVarCreateBuilder2.copyOnWrite();
                PartialSegmentOuterClass$PartialSegment partialSegmentOuterClass$PartialSegment = (PartialSegmentOuterClass$PartialSegment) aihfVarCreateBuilder2.instance;
                formatIdOuterClass$FormatId2.getClass();
                partialSegmentOuterClass$PartialSegment.c = formatIdOuterClass$FormatId2;
                partialSegmentOuterClass$PartialSegment.b |= 1;
                long j6 = bufferedMediaSegment.b;
                aihfVarCreateBuilder2.copyOnWrite();
                PartialSegmentOuterClass$PartialSegment partialSegmentOuterClass$PartialSegment2 = (PartialSegmentOuterClass$PartialSegment) aihfVarCreateBuilder2.instance;
                partialSegmentOuterClass$PartialSegment2.b |= 4;
                partialSegmentOuterClass$PartialSegment2.e = j6;
                TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRangeF = bufferedMediaSegment.f();
                aihfVarCreateBuilder2.copyOnWrite();
                PartialSegmentOuterClass$PartialSegment partialSegmentOuterClass$PartialSegment3 = (PartialSegmentOuterClass$PartialSegment) aihfVarCreateBuilder2.instance;
                timeRangeOuterClass$TimeRangeF.getClass();
                partialSegmentOuterClass$PartialSegment3.f = timeRangeOuterClass$TimeRangeF;
                partialSegmentOuterClass$PartialSegment3.b |= 8;
                long jA3 = bufferedMediaSegment.a();
                aihfVarCreateBuilder2.copyOnWrite();
                PartialSegmentOuterClass$PartialSegment partialSegmentOuterClass$PartialSegment4 = (PartialSegmentOuterClass$PartialSegment) aihfVarCreateBuilder2.instance;
                partialSegmentOuterClass$PartialSegment4.b |= 16;
                partialSegmentOuterClass$PartialSegment4.g = jA3;
                long j7 = bufferedMediaSegment.c;
                if (j7 != 0) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    PartialSegmentOuterClass$PartialSegment partialSegmentOuterClass$PartialSegment5 = (PartialSegmentOuterClass$PartialSegment) aihfVarCreateBuilder2.instance;
                    partialSegmentOuterClass$PartialSegment5.b |= 2;
                    partialSegmentOuterClass$PartialSegment5.d = j7;
                }
                list3.add((PartialSegmentOuterClass$PartialSegment) aihfVarCreateBuilder2.build());
            }
        }
        if (aihfVarCreateBuilder != null) {
            aihfVarCreateBuilder.copyOnWrite();
            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange9 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange6 = (TimeRangeOuterClass$TimeRange) builder.build();
            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange10 = BufferedRangeOuterClass$BufferedRange.a;
            timeRangeOuterClass$TimeRange6.getClass();
            bufferedRangeOuterClass$BufferedRange9.f = timeRangeOuterClass$TimeRange6;
            bufferedRangeOuterClass$BufferedRange9.b |= 32;
            list2.add((BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.build());
        }
    }
}
