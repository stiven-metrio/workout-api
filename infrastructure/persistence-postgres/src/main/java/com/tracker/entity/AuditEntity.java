package com.tracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * Base entity class for audit-related fields such as creation and modification information.
 * <p>
 * This class serves as a base for entities that need to track creation and modification metadata.
 */
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
abstract class AuditEntity {

	@Column(updatable = false, name = "createdDate")
	@CreatedDate
	protected LocalDateTime createdDate;

	@Column(updatable = false, name = "createdBy")
	@CreatedBy
	protected String createdBy;

	@Column(name = "modifiedDate")
	@LastModifiedDate
	protected LocalDateTime modifiedDate;

	@Column(name = "modifiedBy")
	@LastModifiedBy
	protected String modifiedBy;
}
