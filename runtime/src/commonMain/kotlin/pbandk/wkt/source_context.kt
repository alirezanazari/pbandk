@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

interface SourceContext : pbandk.Message {
    val fileName: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceContext
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext>

    companion object : pbandk.Message.Companion<pbandk.wkt.SourceContext> {
        operator fun invoke(
            fileName: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.SourceContext = SourceContext_Impl(
            fileName,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.SourceContext() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.SourceContext.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.SourceContext, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file_name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "fileName",
                        value = pbandk.wkt.SourceContext::fileName
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.SourceContext::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun SourceContext?.orDefault() = this ?: SourceContext.defaultInstance

fun SourceContext.copy(
    fileName: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): SourceContext = (this as SourceContext_Impl).copy(
    fileName,
    unknownFields
)

private data class SourceContext_Impl(
    override val fileName: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SourceContext {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = SourceContext.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun SourceContext.protoMergeImpl(plus: pbandk.Message?): SourceContext = (plus as? SourceContext)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SourceContext.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SourceContext {
    var fileName = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fileName = _fieldValue as String
        }
    }
    return SourceContext(fileName, unknownFields)
}
