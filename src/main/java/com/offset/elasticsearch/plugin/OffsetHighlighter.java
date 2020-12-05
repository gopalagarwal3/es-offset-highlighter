package com.offset.elasticsearch.plugin;

import org.apache.lucene.search.highlight.Encoder;
import org.apache.lucene.search.uhighlight.CustomUnifiedHighlighter;
import org.apache.lucene.search.uhighlight.PassageFormatter;
import org.elasticsearch.index.query.QueryShardContext;
import org.elasticsearch.search.fetch.FetchSubPhase.HitContext;
import org.elasticsearch.search.fetch.subphase.highlight.UnifiedHighlighter;
import org.elasticsearch.search.fetch.subphase.highlight.SearchContextHighlight;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OffsetHighlighter extends UnifiedHighlighter {

    public static final String NAME = "offset";

    @Override
    protected PassageFormatter getPassageFormatter(HitContext hitContext,SearchContextHighlight.Field field, Encoder encoder) {
        // Retrieve the annotations from the hitContext
        return new OffsetPassageFormatter();
    }

}